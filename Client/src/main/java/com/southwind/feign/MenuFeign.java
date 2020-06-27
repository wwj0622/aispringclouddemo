package com.southwind.feign;

import com.southwind.entity.TMenu;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "menu")
public interface MenuFeign {

    @GetMapping("/tMenu/select")
    public List<TMenu>  findAll();

}
