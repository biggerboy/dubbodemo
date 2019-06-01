package com.dubbodemo.me.vo;

import java.io.Serializable;

public class  ResultVO<T> implements Serializable{
    private T data;
    private String msg;
    private String status;

    public ResultVO() {
    }

    public ResultVO(T data, String msg, String status) {
        this.data = data;
        this.msg = msg;
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
