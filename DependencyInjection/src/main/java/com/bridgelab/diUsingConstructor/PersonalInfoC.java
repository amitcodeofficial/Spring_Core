package com.bridgelab.diUsingConstructor;

public class PersonalInfoC {
    private String firstName;
    private String lastName;
    private int id;

    public PersonalInfoC(String firstName){
        this.firstName=firstName;
    }

    public PersonalInfoC(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public void displayName(){
        System.out.println("\nID - "+id);
        System.out.println("First Name - "+firstName);
        System.out.println("Last Name - "+lastName);
    }
}
