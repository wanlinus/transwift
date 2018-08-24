package cn.wanlinus.transwift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author wanli
 */
@SpringBootApplication
@EnableWebMvc
public class TranswiftApplication {

    public static void main(String[] args) {
        SpringApplication.run(TranswiftApplication.class, args);
    }
}
