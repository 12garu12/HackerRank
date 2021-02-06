package com.company;

public class Person {

    String firstName;
    String lastName;
    int id;

    public Person(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public void printPerson() {
        System.out.println("Name: " + firstName + ", " + lastName);
        System.out.println("ID: " + id);
    }
}
