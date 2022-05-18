package com.bridgelab.DI;

public class DellLaptop {
    Intel i3;

    public DellLaptop(Intel i3) {
        this.i3 = i3;
    }

    public void checkProcessor(){
        if(i3!=null){
            System.out.println("Dell laptop has processor installed.");
            i3.processorName();
            System.out.println("Dell laptop is working...");
        }else{
            System.out.println("Dell laptop does not have processor installed.");
        }
    }
}
