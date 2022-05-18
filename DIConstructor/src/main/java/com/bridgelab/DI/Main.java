package com.bridgelab.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        DellLaptop inspiron15 = context.getBean("inspiron15bean", DellLaptop.class);
        inspiron15.checkProcessor();
    }
}
