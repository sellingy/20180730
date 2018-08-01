package com.gzcc.demo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:yang
 * @version:
 * @Project: 20180730
 * @Package: com.gzcc.demo.model
 * @Description:
 * @Date date: 2018/7/31
 */
public class Data {
    private String name;
    private String type;
    private List<Food> foods=new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

}
