package com.bridgelab.diprac;

import org.springframework.context.ApplicationContext;

public class Pan implements Services{

    public void gotNameP(){
        ApplicationContext context = FactoryService.getInstanceC();
        Name name = FactoryService.getInstanNameN();
        name.giveName();
        System.out.println("Pan Has Received Your Application");
    }

    @Override
    public void Card() {
        gotNameP();
    }
}
