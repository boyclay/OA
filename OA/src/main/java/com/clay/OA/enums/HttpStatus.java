package com.clay.OA.enums;

/**
 * @program: OA
 * @description: 请求状态码
 * @author: bob
 * @create: 2021-01-29 15:02
 **/
public enum HttpStatus {

    SUCCESS(200,"SUCCESS");

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

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
