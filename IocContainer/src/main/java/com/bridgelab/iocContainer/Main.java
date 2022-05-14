package com.bridgelab.iocContainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");

//        Getting Object from bean created in Config.xml file bu using getBean method
        Calculator calc = context.getBean("calculator", Calculator.class);
        calc.UI();

    }

}
