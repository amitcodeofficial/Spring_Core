package com.bridgelab.diprac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = FactoryService.getInstanceC();

        Services a = context.getBean("servicesA", Services.class);
        a.Card();

        Services p = context.getBean("servicesP", Services.class);
        p.Card();

        Services d = context.getBean("servicesD", Services.class);
        d.Card();
    }

}
