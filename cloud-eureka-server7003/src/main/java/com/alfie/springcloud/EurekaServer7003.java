package com.alfie.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Alfie
 * @date 2020/8/17 15:38
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7003 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7003.class,args);
    }
}
