package com.zst.cloud.api;

import lombok.Getter;
import lombok.Setter;

/**
 * 通用API响应内容包装类
 *
 * @param <T>
 */
@Getter
@Setter
public class Result<T> {
    /**
     * 调用是否成功
     */
    private boolean success;
    /**
     * 调用失败时的错误信息
     */
    private String message;
    /**
     * 调用成功时的返回数据
     */
    private T data;
    /**
     * 响应码
     */
    private int code;
    /**
     * 响应时间戳
     */
    private long timestamp = System.currentTimeMillis();

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setSuccess(true);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> error(int code, String message) {
        Result<T> result = new Result<>();
        result.setSuccess(false);
        result.setCode(code);
        result.setMessage(message);
        return result;
    }
}
