package com.alfie.springcloud.controller;

import com.alfie.springcloud.entities.CommonResult;
import com.alfie.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Alfie
 * @date 2020/8/17 16:25
 */
@RestController
public class OrderController {

    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping(value = "/consumer/payments/")
    public CommonResult<Payment> create(@RequestBody Payment payment){
        return restTemplate.postForObject(PAYMENT_URL,payment,CommonResult.class);
    }

    @GetMapping(value = "/consumer/payments/{id}")
    public CommonResult<Payment> getPayment(@PathVariable Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payments/"+id,CommonResult.class);
    }

}
