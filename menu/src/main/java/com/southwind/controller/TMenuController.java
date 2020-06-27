package com.southwind.controller;

import com.southwind.entity.TMenu;
import com.southwind.service.TMenuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TMenu)表控制层
 *
 * @author makejava
 * @since 2020-06-25 16:51:15
 */
@RestController
@RequestMapping("/tMenu")
public class TMenuController {
    /**
     * 服务对象
     */
    @Resource
    private TMenuService tMenuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public TMenu selectOne(Integer id) {
        System.out.println(id);
        return this.tMenuService.queryById(id);
    }

    @RequestMapping("/select")
    public List<TMenu> sleect(){
      return   tMenuService.queryAllByLimit(1,2);
    }

}