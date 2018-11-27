package org.xiaokui.springboot.mybatis.common;

import java.io.Serializable;

/**
 * @author xiaokui
 * @Description:创建响应结果类
 * @date 2018-04-02 17:07
 */
public final class ResponseResult<T> implements Serializable {

    private static final long serialVersionUID = -4071533425594839914L;

    private String code;
    private String message;
    private T data;

    public ResponseResult() {
    }
    public ResponseResult(String code, String message) {
        this.code = code;
        this.message = message;
    }
    public ResponseResult(String code, T data) {
        this.code = code;
        this.data = data;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
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
