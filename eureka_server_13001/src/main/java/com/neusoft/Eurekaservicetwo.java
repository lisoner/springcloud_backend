package com.neusoft;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@SpringBootApplication
@EnableEurekaServer  //激活Eureka Server
public class Eurekaservicetwo {
    public static void main(String[] args) {
        SpringApplication.run(Eurekaservicetwo.class, args);
    }
}