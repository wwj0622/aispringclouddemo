package com.southwind.controller;

import com.southwind.entity.TMenu;
import com.southwind.feign.MenuFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/client")
public class controller {

    @Resource
    private MenuFeign menuFeign;

    @GetMapping("/client")
    public List<TMenu> find(){
        return menuFeign.findAll();
    }
}
