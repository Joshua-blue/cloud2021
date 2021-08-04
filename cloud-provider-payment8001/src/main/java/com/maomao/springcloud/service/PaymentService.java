package com.maomao.springcloud.service;

import com.maomao.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * description: PaymentService
 * date: 2021/7/31 11:11
 * author: MSXQ
 * version: 1.0
 */
public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}
