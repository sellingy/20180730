package com.gzcc.demo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:yang
 * @version:
 * @Project: 20180730
 * @Package: com.gzcc.demo.model
 * @Description:
 * @Date date: 2018/8/1
 */
public class Result {
    private String code;
    private String msg;
    private List<Data> data=new ArrayList<>();
    public Result(String code,String msg){
         this.code=code;
         this.msg=msg;
    }
    public Result(){

    }
    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
