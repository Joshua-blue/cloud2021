package com.maomao.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
*@Author MSXQ
*@Date 2021/7/31 10:52
*/
@Data
@AllArgsConstructor//使用lombok自动构建全参构造方法
@NoArgsConstructor//自动构建无参构造方法
public class Payment {
    private Long id;
    private String serial;
}
