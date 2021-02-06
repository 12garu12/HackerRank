package com.company;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static char prompt(String args) throws IOException {
        System.out.println(args + ":" + " ");
        return (char) System.in.read();
    }

    public static void main(String[] args) {
        // write your code here
        char ch;
        try {
            //dado que prompt() podría arrojar una excepción,
            // una llamada debe incluirse dentro de un bloque try
            ch = prompt("Ingresar una letra");
        } catch (IOException exc) {
            System.out.println("Ocurrió una excepción de E/S");
            ch = 'X';
        }
        System.out.println("Usted presionó: " + ch);
    }
}