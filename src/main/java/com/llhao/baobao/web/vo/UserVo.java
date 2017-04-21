package com.llhao.baobao.web.vo;

import com.llhao.baobao.entity.User;

/**
 * Created by luohao on 2017-4-16.
 */
public class UserVo {
    private int code;
    private String name;
    private int id;

    public UserVo(User user){
        setAll(user);
    }

    public UserVo(){

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setAll(User user){
        if(user==null){
            setCode(404);
            return;
        }
        setId(user.getId());
        setName(user.getName());
        setCode(200);
    }
}
