package com.southwind.controller;

import com.southwind.entity.TType;
import com.southwind.service.TTypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TType)表控制层
 *
 * @author makejava
 * @since 2020-06-25 22:12:48
 */
@RestController
@RequestMapping("tType")
public class TTypeController {
    /**
     * 服务对象
     */
    @Resource
    private TTypeService tTypeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TType selectOne(Integer id) {
        return this.tTypeService.queryById(id);
    }

}