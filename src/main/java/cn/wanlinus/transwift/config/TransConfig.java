package cn.wanlinus.transwift.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author wanli
 * @date 2018-08-23 14:30
 */
@Configuration
public class TransConfig {

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
