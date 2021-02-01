package com.clay.OA.enums;

/**
 * @program: OA
 * @description: 异常处理状态码
 * @author: bob
 * @create: 2021-01-29 15:20
 **/
public enum ErrorStatus {

    MissingServletRequestParameterException(200001, "MissingServletRequestParameterException"),
    NullPointerException(200002, "NullPointerException"),
    ClassNotFoundException(200003, "ClassNotFoundException"),
    SQLException(200004, "SQLException"),
    FileNotFoundException(200005, "FileNotFoundException");

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

    ErrorStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
