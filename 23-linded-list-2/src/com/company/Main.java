package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Numero de personas: ");
        int entradas = entrada.nextInt();
        Person reference = null;
        NewPerson obj = new NewPerson();
        int id = 0;

        while (entradas-- > 0) {
            id++;
            System.out.println("Persona " + id);
            System.out.print("Name:  ");
            String name = entrada.next();
            System.out.print("Lastname:  ");
            String lastName = entrada.next();
            int age = (int) Math.round(Math.random() * 50);
            reference = obj.insertPerson(reference, id, name, lastName, age);
            System.out.println();
        }
        obj.printDataPerson(reference);
        entrada.close();

    }
}
