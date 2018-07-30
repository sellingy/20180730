package com.gzcc.demo.model;

/**
 * @author:yang
 * @version:
 * @Project: 20180730
 * @Package: com.gzcc.demo.Model
 * @Description:
 * @Date date: 2018/7/30
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content){
        this.id=id;
        this.content=content;

    }
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }



}
