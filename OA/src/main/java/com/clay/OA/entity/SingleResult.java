package com.clay.OA.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @program: OA
 * @description: 单条记录返回
 * @author: bob
 * @create: 2021-01-29 14:42
 **/
@ApiModel("单条记录返回")
public class SingleResult<T>{

    @ApiModelProperty("返回状态码 正常情况为200 错误情况返回枚举code")
    public int code;

    @ApiModelProperty("正常为SUCCESS 错误情况返回枚举msg")
    private String message;

    @ApiModelProperty("返回内容体  T为泛型")
    private T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
