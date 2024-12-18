package im.zhaojun.zfile.module.login.service;

import im.zhaojun.zfile.core.constant.SecurityConstants;
import im.zhaojun.zfile.core.exception.LoginVerifyException;
import im.zhaojun.zfile.core.util.JwtTokenUtils;
import im.zhaojun.zfile.module.login.entity.JwtUser;
import im.zhaojun.zfile.module.login.entity.User;
import im.zhaojun.zfile.module.login.request.UserLoginRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.security.auth.RefreshFailedException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AuthService {
    private final IUserService userService;
    private final StringRedisTemplate stringRedisTemplate;



    public String[] createToken(UserLoginRequest userLoginRequest) {
        String username = userLoginRequest.getUsername();
        String password = userLoginRequest.getPassword();
        User user = userService.findUserAllProperties(username);
        // System.out.println(user.toString());

        if(user==null) {
            throw new LoginVerifyException("账号不存在");
        }
        if (!userService.check(password, user.getPassword())) {
            throw new BadCredentialsException("The user name or password is not correct.");
        }
        JwtUser jwtUser = new JwtUser(user);
        if (!jwtUser.isEnabled()) {
            throw new BadCredentialsException("User is forbidden to login");
        }
        List<String> authorities = jwtUser.getAuthorities()
                .stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toList());

        String accessToken = JwtTokenUtils.createToken(user.getUserName(), user.getId().toString(), authorities, false);
        String freshToken = JwtTokenUtils.createToken(user.getUserName(), user.getId().toString(), authorities, true);
        stringRedisTemplate.opsForValue().set(user.getId().toString(), accessToken, SecurityConstants.EXPIRATION, TimeUnit.SECONDS);
        stringRedisTemplate.opsForValue().set(SecurityConstants.REFRESH_TOKEN + user.getId().toString(), freshToken,
                SecurityConstants.EXPIRATION_REMEMBER, TimeUnit.SECONDS);
        String[] tokens = new String[]{accessToken, freshToken.replace(SecurityConstants.TOKEN_PREFIX, "")};
        return tokens;
    }

    public void removeToken() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication==null && authentication.getPrincipal()==null) {
            throw new LoginVerifyException("没有相关用户信息，注销失败");
        }
        String userId = authentication.getPrincipal().toString();

        stringRedisTemplate.delete(userId);
    }

    public Boolean checkLogin() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication==null && authentication.getPrincipal()==null) {
            return false;
        }
        String userId = authentication.getPrincipal().toString();

        String token = stringRedisTemplate.opsForValue().get(userId);
        if(token == null) {
            return false;
        }
        return true;
    }

    public String refreshToken(String refreshToken) throws RefreshFailedException {
        String userId = JwtTokenUtils.getId(refreshToken);
        String token = stringRedisTemplate.opsForValue().get(SecurityConstants.REFRESH_TOKEN + userId);
        if(token == null) {
            return null;
        }

        String accessToken = JwtTokenUtils.createToken(JwtTokenUtils.getSub(refreshToken),
                JwtTokenUtils.getId(refreshToken),
                JwtTokenUtils.getRoles(refreshToken), false);
        stringRedisTemplate.opsForValue().set(userId, accessToken, SecurityConstants.EXPIRATION, TimeUnit.SECONDS);
        return accessToken;
    }
}
