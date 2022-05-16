package com.bridgelab.diautowire;

public class ServiceProvider {
    private Sim sim;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
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
