package com.alfie.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alfie
 * @date 2020/8/17 0017 21:01
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){

        return new RandomRule();
    }
}
