package com.alfie.springcloud.controller;

import com.alfie.springcloud.entities.CommonResult;
import com.alfie.springcloud.entities.Payment;
import com.alfie.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Alfie
 * @date 2020/8/12 0012 22:19
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping("/payments")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);

        log.info("=====create successful====");

        if(result>0){
            return  new CommonResult(200,"create payment successful",result);
        }else {
            return new CommonResult(444,"create payment failed",null);
        }
    }

    @GetMapping("/payments/{id}")
    public CommonResult getPaymentById(@PathVariable Long id){

        Payment payment = paymentService.getPaymentById(id);

        log.info("======== fetch payment successful  ====");
        if(payment != null ){
            return new CommonResult(200,"fetch payment successful.",payment);
        }else {
            return new CommonResult(200,"Fetch payment failed");
        }
    }

}
