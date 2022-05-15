package com.bridgelab.dio;

public class Person {
    private DisplayName display;

    public Person(DisplayName display) {
        this.display = display;
    }

    public void setDisplay(DisplayName display) {
        this.display = display;
    }

    public void show(){
        display.displayName();
    }
}
