package com.bridgelab.dic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    Customer customer;

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        Main main1 = context.getBean("main", Main.class);
        System.out.println(main1.customer);
    }

}
