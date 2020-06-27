package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class NactiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(NactiveApplication.class,args);
    }
}
