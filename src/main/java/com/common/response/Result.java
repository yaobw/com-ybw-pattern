package com.common.response;

import java.io.Serializable;

/**
 * @description:
 * @author: yaobw
 * @date: 2020/5/25 9:49 下午
 */
public class Result<T> implements Serializable {

    private static final long serialVersionUID = -9198551072362151744L;

    private static final int SUCCESS_CODE = 10000;


    public int code;

    public String msg;

    public T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    public Result() {
    }

    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }




}
