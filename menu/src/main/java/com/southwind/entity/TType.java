package com.southwind.entity;

import java.io.Serializable;

/**
 * (TType)实体类
 *
 * @author makejava
 * @since 2020-06-25 22:12:48
 */
public class TType implements Serializable {
    private static final long serialVersionUID = -80239064632574618L;
    
    private Integer id;
    
    private String name;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}