package com.bridgelab.diprac;

import org.springframework.context.ApplicationContext;

public class DrivingLicense implements Services{

    public void gotNameD(){
        ApplicationContext context = FactoryService.getInstanceC();
        Name name = FactoryService.getInstanNameN();
        name.giveName();
        System.out.println("Driving License Received Your Application");
    }

    @Override
    public void Card() {
        gotNameD();
    }
}
