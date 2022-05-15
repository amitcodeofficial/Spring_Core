package com.bridgelab.diUsingSetter;

public class PersonalInfo {
    private String firstName;
    private String lastName;

    public void setFirstName(String firstName) {
        System.out.println("FirstName Setter method");
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void displayName(){
        System.out.println("First Name - "+firstName);
        System.out.println("Last Name - "+lastName);
    }
}
