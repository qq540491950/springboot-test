package com.hdsx.springboot.entity;

import java.io.Serializable;

/**
 * @author lirt
 */
public class Result<T> {


    /**
     * 返回状态吗 0失败 1成功
     */
    private Integer code;
    /**
     * 返回数据
     */
    private T data;
    /**
     * 返回消息提示
     */
    private String message;

    public Result() {
    }

    public Result(Integer code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}
