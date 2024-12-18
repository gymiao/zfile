package im.zhaojun.zfile.core.filter;

import cn.hutool.core.text.AntPathMatcher;
import im.zhaojun.zfile.core.constant.SecurityConstants;
import im.zhaojun.zfile.core.exception.ExpireAccessTokenException;
import im.zhaojun.zfile.core.exception.LoginVerifyException;
import im.zhaojun.zfile.core.exception.ServiceException;
import im.zhaojun.zfile.core.util.CodeMsg;
import im.zhaojun.zfile.core.util.JwtTokenUtils;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

@Slf4j
public class JwtAuthorizationFilter extends BasicAuthenticationFilter {

    // Redis
    private final StringRedisTemplate stringRedisTemplate;

    public JwtAuthorizationFilter(AuthenticationManager authenticationManager, StringRedisTemplate stringRedisTemplate) {
        super(authenticationManager);
        this.stringRedisTemplate = stringRedisTemplate;
    }


    public boolean isUriInWhitelist(String uri) {
        AntPathMatcher pathMatcher = new AntPathMatcher();
        for (String pattern : SecurityConstants.SYSTEM_WHITELIST) {
            if (pathMatcher.match(pattern, uri)) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected void onUnsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException {
        super.onUnsuccessfulAuthentication(request, response, failed);
        System.out.println(failed.getMessage() + " " + failed.getCause());
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain chain) throws IOException, ServletException, ExpireAccessTokenException {

        if (request.getRequestURI().equals("request.getRequestURI()")) {
            chain.doFilter(request, response);
        }
        String token = request.getHeader(SecurityConstants.ACCESS_TOKEN_HEADER);
        // 读取不到，拦截
        if (token==null || !token.startsWith(SecurityConstants.TOKEN_PREFIX)) {
            SecurityContextHolder.clearContext();
            chain.doFilter(request, response);
            return;
        }
        String accessToken = token.replace(SecurityConstants.TOKEN_PREFIX, "");

        UsernamePasswordAuthenticationToken authentication = null;

        try {
            // redis是否有此 token
            String previousToken = stringRedisTemplate.opsForValue().get(JwtTokenUtils.getId(accessToken));
            if (token == null) {
                throw new ExpireAccessTokenException("token_expired");
            }
            if (!token.equals(previousToken)) {
                SecurityContextHolder.clearContext();
                chain.doFilter(request, response);
                return ;
            }
            authentication = JwtTokenUtils.getAuthentication(accessToken);
        } catch (JwtException e) {
            // accessToken过期
            if(e instanceof ExpiredJwtException && !isUriInWhitelist(request.getRequestURI())) {
                logger.error("Jwt Expired: " + e.getMessage());
                //如果access-token过时，则解析refresh-token
                response.setStatus(406);
                chain.doFilter(request, response);
                return;
            }
            logger.error("Invalid jwt:" + e.getMessage());
        }
        // 信息保存在 ThreadLocal 中
        SecurityContextHolder.getContext().setAuthentication(authentication);
        chain.doFilter(request, response);
    }
}
