package com.bridgelab.dio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ConfigO.xml");
        Person amit = context.getBean("person", Person.class);
        amit.show();
    }
}
