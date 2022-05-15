package com.bridgelab.diprac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryService {
    private ApplicationContext context;
    private Name name;

    public static ApplicationContext getInstanceC(){
        return new ClassPathXmlApplicationContext("ConfigP.xml");
    }

    static ApplicationContext contextF = getInstanceC();

    public static Name getInstanNameN(){
        return contextF.getBean("name", Name.class);
    }
}
