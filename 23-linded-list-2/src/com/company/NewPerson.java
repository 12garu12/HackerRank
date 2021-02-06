package com.company;

public class NewPerson {

    public Person insertPerson(Person reference, int id, String name, String lastName, int age) {
        Person newPerson = new Person(id, name, lastName, age);
        Person firstReference = reference;
        if (reference == null) {
            reference = newPerson;
            return reference;
        }
        while (firstReference.nextReference != null) {
            firstReference = firstReference.nextReference;
        }
        firstReference.nextReference = newPerson;
        return reference;
    }

    public void printDataPerson(Person refence) {
        Person start = refence;
        while (start != null) {
            System.out.println(
                    "\n******************************" +
                            "\nid: " + start.id +
                            "\nname: " + start.name +
                            "\nlastname: " + start.lastName +
                            "\nage: " + start.age +
                            "\n******************************");

            start = start.nextReference;
        }

    }

}
