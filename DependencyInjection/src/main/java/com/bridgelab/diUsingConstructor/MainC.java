package com.bridgelab.diUsingConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainC {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ConfigC.xml");
        PersonalInfoC p1 = context.getBean("personalInfoC", PersonalInfoC.class);
        p1.displayName();

        PersonalInfoC p2 = context.getBean("personalInfoC2", PersonalInfoC.class);
        p2.displayName();

        PersonalInfoC p3 = context.getBean("personalInfoC3", PersonalInfoC.class);
        p3.displayName();

        PersonalInfoC p4 = context.getBean("personalInfoC4", PersonalInfoC.class);
        p4.displayName();
    }
}
