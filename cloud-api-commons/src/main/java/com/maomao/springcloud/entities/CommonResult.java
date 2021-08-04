package com.maomao.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description: CommonResult
 * date: 2021/7/31 11:03
 * author: MSXQ
 * version: 1.0
 */
@Data
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
