package com.bridgelab.diautowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");

        ServiceProvider Airtel = context.getBean("Airtel", ServiceProvider.class);
        Airtel.serviceCallingService();
        Airtel.serviceInternetService();
    }
}
