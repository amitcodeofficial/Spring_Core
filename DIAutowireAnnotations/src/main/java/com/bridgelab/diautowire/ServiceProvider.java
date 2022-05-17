package com.bridgelab.diautowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ServiceProvider {
    @Autowired
    @Qualifier("simVodaPhone")
    private Sim sim;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void serviceCallingService(){
        System.out.println(name+" is providing calling service");
        sim.calling();
    }

    public void serviceInternetService(){
        System.out.println(name+" is providing internet services");
        sim.internet();
    }
}
