package com.wangzefeng.lovers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LoversApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoversApplication.class, args);
    }

}
