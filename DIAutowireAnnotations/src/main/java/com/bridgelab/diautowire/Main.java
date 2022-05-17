package com.bridgelab.diautowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");

        ServiceProvider services = context.getBean("vodaphone", ServiceProvider.class);
        services.serviceCallingService();
        services.serviceInternetService();
    }
}
