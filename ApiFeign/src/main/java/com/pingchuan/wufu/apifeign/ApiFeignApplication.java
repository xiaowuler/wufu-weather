package com.pingchuan.wufu.apifeign;

import com.pingchuan.wufu.apifeign.Configs.Swagger2Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;

@Import(Swagger2Config.class)
@SpringBootApplication
@EnableFeignClients
public class ApiFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiFeignApplication.class, args);
    }

}
