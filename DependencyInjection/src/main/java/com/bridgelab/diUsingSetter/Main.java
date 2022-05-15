package com.bridgelab.diUsingSetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ConfigS.xml");
        PersonalInfo p1 = context.getBean("personalInfo", PersonalInfo.class);
        p1.displayName();

        PersonalInfo p2 = context.getBean("personalInfo2", PersonalInfo.class);
        p2.displayName();
    }
}
