package com.company;

public class Person {

    int id;
    String name;
    String lastName;
    int age;
    Person nextReference;

    public Person(int id, String name, String lastName, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.nextReference = null;
    }
}
