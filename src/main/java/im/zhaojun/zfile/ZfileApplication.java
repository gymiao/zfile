package im.zhaojun.zfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


/**
 * @author zhaojun
 */
@SpringBootApplication
// 开启 aop 支持
@EnableAspectJAutoProxy(exposeProxy = true, proxyTargetClass = true)
@ServletComponentScan(basePackages = {"im.zhaojun.zfile.core.filter", "im.zhaojun.zfile.module.storage.filter"})
@ComponentScan(basePackages = "im.zhaojun.zfile.*")
public class ZfileApplication {

    public static void main(String[] args) {
        System.out.println("test");
        System.out.println("demo");
        SpringApplication.run(ZfileApplication.class, args);
        System.out.println("服务器启动成功！");
    }

}