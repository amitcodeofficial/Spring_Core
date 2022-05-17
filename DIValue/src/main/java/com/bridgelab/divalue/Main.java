package com.bridgelab.divalue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    @Autowired
    Customer customer;

    public void displayCustomer(){
        System.out.println(customer);
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");

        Main m = context.getBean("main", Main.class);
        m.displayCustomer();
    }
}
