package com.company;

import static com.company.HairColor.*;

public class Person {

    HairColor hairColor = BLACK;

    public Person() {

    }

    public static void main(String[] args) {

        Person peterParker = new Person();
        Person spiderman = peterParker;

        peterParker.hairColor = PINK;

        System.out.println("Hair color of Petter Parker: " + peterParker.hairColor);
        System.out.println("Hair color of Spiderman: " + spiderman.hairColor);
    }
}
