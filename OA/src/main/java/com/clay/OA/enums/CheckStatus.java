package com.clay.OA.enums;

/**
 * @program: OA
 * @description: 校验信息
 * @author: bob
 * @create: 2021-01-29 17:38
 **/
public enum CheckStatus {

    userInfoEmpty(100001, "userInfo is Empty");

    private int code;

    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    CheckStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }
}


