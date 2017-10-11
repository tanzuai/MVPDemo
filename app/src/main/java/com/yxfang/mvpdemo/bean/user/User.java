package com.yxfang.mvpdemo.bean.user;

import lombok.Data;

/**
 * User: yxfang
 * Date: 2016-04-29
 * Time: 10:56
 * ------------- Description -------------
 * ---------------------------------------
 */
@Data
public class User
{
    private int id;
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
