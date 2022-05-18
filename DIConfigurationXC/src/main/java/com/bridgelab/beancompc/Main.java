package com.bridgelab.beancompc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        College c = context.getBean("college1", College.class);
        c.collegeName();

        College c2 = context.getBean("college2", College.class);
        c2.collegeName();
    }
}
