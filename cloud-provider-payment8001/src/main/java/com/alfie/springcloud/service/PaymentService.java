package com.alfie.springcloud.service;

import com.alfie.springcloud.entities.Payment;

/**
 * @author Alfie
 * @date 2020/8/12 0012 22:11
 */
public interface PaymentService {


    public int create(Payment payment);

    public Payment getPaymentById( Long id);
}
