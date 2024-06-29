package com.neusoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer //开启springcloud config服务端注解
public class Configserviceone {

    public static void main(String[] args) {
        SpringApplication.run(Configserviceone.class, args);
    }
}
