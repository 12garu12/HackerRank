package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String numCadena = "1 3 5 5 6";
        String a = numCadena.replaceAll(" ", ","); // Para hacer cambios por ejemplo espacios por comas
        System.out.println(a);

        int numero = 23;
        String cadena = Integer.toString(numero); // para convertir de entero a string
        System.out.println(cadena);
        System.out.println(cadena.getClass().getSimpleName()); // para saber que tipo de dato es si es un tipo de dato primitivo  se tiene que convertir a objeto (Object)nombreDeLaVariable

        int num = 45;
        String nuevoNum = num + ""; // para convertir de entero a string
        System.out.println(nuevoNum + " " + nuevoNum.getClass().getSimpleName());

    }
}
