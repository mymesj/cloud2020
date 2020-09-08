package com.alfie.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Alfie
 * @date 2020/8/12 0012 21:44
 */
@SpringBootApplication
@Slf4j
//@EnableDiscoveryClient
@EnableEurekaClient
public class PaymentBootstrap8002 {

    public static void main(String[] args) {

        SpringApplication.run(PaymentBootstrap8002.class,args);

        log.info("start successful");

    }
}
