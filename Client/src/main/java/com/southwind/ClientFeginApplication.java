package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ClientFeginApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientFeginApplication.class,args);
    }
}
