package com.aygxy.base;

/**
 * 响应码枚举，参考HTTP状态码的语义
 */
public enum ResultCode {
    SUCCESS(200),//成功
    ALL_SUCCESS(0000),//成功
    FAIL(400),//失败
    UNAUTHORIZED(401),//未认证（签名错误）
    NOT_FOUND(404),//接口不存在
    INTERNAL_SERVER_ERROR(500),//服务器内部错误
    HTTP_WEB_SERVER_ERROR(501),//服务器不具有请求功能
    BAD_GETEWAY_SERVER_ERROR(502),//服务器错误网关
    TIMEOUT_SERVER_ERROR(504);//服务器网关超时

    public int code;

    ResultCode(int code) {
        this.code = code;
    }
}
