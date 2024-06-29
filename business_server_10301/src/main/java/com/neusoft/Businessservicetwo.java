package com.neusoft;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Businessservicetwo {

    public static void main(String[] args) {
        SpringApplication.run(Businessservicetwo.class, args);
    }
}
