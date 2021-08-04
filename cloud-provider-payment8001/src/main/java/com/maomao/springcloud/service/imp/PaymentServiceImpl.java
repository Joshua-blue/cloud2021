package com.maomao.springcloud.service.imp;

import com.maomao.springcloud.dao.PaymentDao;
import com.maomao.springcloud.entities.Payment;
import com.maomao.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * description: PaymentServiceImpl
 * date: 2021/7/31 11:12
 * author: MSXQ
 * version: 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
