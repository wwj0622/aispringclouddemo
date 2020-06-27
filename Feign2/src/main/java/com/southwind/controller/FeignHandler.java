package com.southwind.controller;

import com.southwind.entity.Student;
import com.southwind.feign.FeignProviderClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class FeignHandler {


    @Resource
    private FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return  feignProviderClient.findAll();
    }


    @GetMapping("/index")
    public String findAll2(){
        System.out.println("11111111111aaaaaaaaaaaaa");
        return  feignProviderClient.index();
    }

}
