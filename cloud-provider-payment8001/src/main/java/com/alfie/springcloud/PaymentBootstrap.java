package com.alfie.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Alfie
 * @date 2020/8/12 0012 21:44
 */
@SpringBootApplication
@Slf4j
public class PaymentBootstrap {

    public static void main(String[] args) {

        SpringApplication.run(PaymentBootstrap.class,args);

        log.info("start successful");

    }
}
