package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableAutoConfiguration
public class ZuuiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuuiApplication.class,args);
    }
}
