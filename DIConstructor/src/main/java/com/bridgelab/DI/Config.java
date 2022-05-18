package com.bridgelab.DI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Intel i3bean(){
        return new Intel();
    }

    @Bean
    public DellLaptop inspiron15bean(){
        DellLaptop laptop = new DellLaptop(i3bean());
        return laptop;
    }

}
