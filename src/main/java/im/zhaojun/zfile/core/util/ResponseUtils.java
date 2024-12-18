package im.zhaojun.zfile.core.util;

import com.alibaba.fastjson2.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Slf4j
public class ResponseUtils {
    public static void out(HttpServletResponse response, String code){
        response.setStatus(HttpStatus.OK.value());
        //统一返回的JSON数据
        response.setContentType("application/json; charset=UTF-8");
        try (ServletOutputStream out = response.getOutputStream()) {
            out.write(JSON.toJSONString(code).getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            log.error("输出数据异常", e);
        }
    }
}