package com.southwind.controller;

import com.southwind.entity.Student;
import com.southwind.repsitory.StudentRepsitory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentHandler {

    @Resource
    private StudentRepsitory studentRepsitory;

    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentRepsitory.findAll();
    }

    @GetMapping("/index")
    public String index(){
        System.out.println("1111111");
        return "当前端口"+this.port;
    }

}
