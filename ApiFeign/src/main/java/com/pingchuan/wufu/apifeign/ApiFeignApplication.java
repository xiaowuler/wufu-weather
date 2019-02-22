package com.pingchuan.wufu.apifeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiFeignApplication.class, args);
    }

}
