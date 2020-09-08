package com.alfie.springcloud.service.impl;

import com.alfie.springcloud.dao.PaymentDao;
import com.alfie.springcloud.entities.Payment;
import com.alfie.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Alfie
 * @date 2020/8/12 0012 22:13
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
