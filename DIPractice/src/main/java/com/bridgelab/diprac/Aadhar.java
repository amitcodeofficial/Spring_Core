package com.bridgelab.diprac;

import org.springframework.context.ApplicationContext;

public class Aadhar implements Services{

    public void gotNameA(){
        ApplicationContext context = FactoryService.getInstanceC();
        Name name = FactoryService.getInstanNameN();
        name.giveName();
        System.out.println("Aadhar Has Received Your Application");
    }

    @Override
    public void Card() {
        gotNameA();
    }
}
