package com.maomao.springcloud.dao;

import com.maomao.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * description: PaymentDao
 * date: 2021/7/31 11:08
 * author: MSXQ
 * version: 1.0
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}
