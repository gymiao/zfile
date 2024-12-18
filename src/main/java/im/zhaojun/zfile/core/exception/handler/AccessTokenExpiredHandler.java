package im.zhaojun.zfile.core.exception.handler;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AccessTokenExpiredHandler implements AccessDeniedHandler {
    /**
     * 当用户尝试访问需要权限才能的REST资源而权限不足的时候，
     * 将调用此方法发送403响应以及错误信息
     */
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        accessDeniedException = new AccessDeniedException("Sorry you don not enough permissions to access it!");
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, accessDeniedException.getMessage());
    }
}
