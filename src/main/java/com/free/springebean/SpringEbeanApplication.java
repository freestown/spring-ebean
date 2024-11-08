package com.free.springebean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringEbeanApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEbeanApplication.class, args);
    }

}
