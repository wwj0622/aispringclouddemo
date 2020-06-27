package com.southwind.entity;

import java.io.Serializable;

/**
 * (TMenu)实体类
 *
 * @author makejava
 * @since 2020-06-25 16:51:12
 */

public class TMenu implements Serializable {
    private static final long serialVersionUID = -57079971930455758L;
    
    private Integer id;
    
    private String name;
    
    private Object price;
    
    private String flavor;
    
    private Integer tid;

    public  TType tType;

    public TType gettType() {
        return tType;
    }

    public void settType(TType tType) {
        this.tType = tType;
    }

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

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

}