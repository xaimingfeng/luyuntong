package com.aygxy.xmf.base;

import com.alibaba.fastjson.JSON;

import java.util.Date;

/**
 * 统一API响应结果封装
 */

public class Result<T> {
    private String code;
    private Boolean success;
    private String message;
    private String origin;
    private Date timestamp;
    private String path;
    private T data;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getOrigin() {
        return origin;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getPath() {
        return path;
    }

    public T getData() {
        return data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public Result<T> setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public Result<T> setCode(String code) {
        this.code = code;
        return this;
    }

    public Result<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public Result<T> setOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    public Result<T> setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public Result<T> setPath(String path) {
        this.path = path;
        return this;
    }

    public Result<T> setData(T data) {
        this.data = data;
        return this;
    }

    public Result() {
    }

    public Result(String code) {
        this.success =true;
        this.code = code;
        if (code.equals(PhysicalConstants.OPERATER_SUCCESS)) {
            this.message = PhysicalConstants.OPERATER_SUCCESS_CN;
        } else if (code.equals(PhysicalConstants.REQUE_SUCCESS)) {
            this.message = PhysicalConstants.REQUE_SUCCESS_CN;
        } else if (code.equals(PhysicalConstants.DELETE_SUCCESS)) {
            this.message = PhysicalConstants.DELETE_SUCCESS_CN;
        } else if (code.equals(PhysicalConstants.UPDATE_SUCCESS)) {
            this.message = PhysicalConstants.UPDATE_SUCCESS_CN;
        }
        this.timestamp = new Date();
    }

    public Result(String code, String message) {
        this.code = code;
        this.message = message;
        this.timestamp = new Date();
    }

    public Result(String path, T data) {
        this.code = PhysicalConstants.OPERATER_SUCCESS;
        this.message = PhysicalConstants.OPERATER_SUCCESS_CN;
        this.timestamp = new Date();
        this.path = path;
        this.data = data;
    }

    public Result(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.timestamp = new Date();
        this.data = data;
    }

    public Result(String code, String message, Date timestamp, String path, T data) {
        this.code = code;
        this.message = message;
        this.timestamp = timestamp;
        this.path = path;
        this.data = data;
    }

    public Result(String code, String message, String origin, Date timestamp, String path, T data) {
        this.code = code;
        this.message = message;
        this.origin = origin;
        this.timestamp = timestamp;
        this.path = path;
        this.data = data;
    }

    public Result(String code, Boolean success, String message, String origin, Date timestamp, String path, T data) {
        this.code = code;
        this.success = success;
        this.message = message;
        this.origin = origin;
        this.timestamp = timestamp;
        this.path = path;
        this.data = data;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public static Result success(String code){return new Result(code);}

    public static Result error(){return new Result(PhysicalConstants.UN_ERROR,PhysicalConstants.UN_ERROR_CN);}

    public static Result success(String path, Object data){
        return new Result(path,data);
    }

}
