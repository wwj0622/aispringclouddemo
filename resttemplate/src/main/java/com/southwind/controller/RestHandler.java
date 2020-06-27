package com.southwind.controller;

import com.southwind.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@RequestMapping("/rest")
public class RestHandler {


    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/findALL")
    public Collection<Student> findAll(){
        return restTemplate.getForObject("http://localhost:8010/student/findAll",Collection.class);
    }

}
