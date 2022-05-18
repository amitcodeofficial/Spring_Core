package com.bridgelab.beancompc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.bridgelab.beancompc")
public class Config {

    @Bean
    public College college1(){
        return new College();
    }

    @Bean
    public College college2(){
        return new College();
    }

}
