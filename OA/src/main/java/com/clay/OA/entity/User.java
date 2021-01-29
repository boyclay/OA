package com.clay.OA.entity;

import java.io.Serializable;

/**
 * @program: OA
 * @description: 用户类
 * @author: bob
 * @create: 2021-01-29 14:35
 **/
public class User  implements Serializable {

    private  String userName;

    private  String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
