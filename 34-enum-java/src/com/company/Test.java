package com.company;

public class Test {

    public static void main(String[] args) {

        // Llamando a values()
        Color[] arr = Color.values();

        // enum con bucle
        for (Color col : arr) {

            // Llamando a ordinal() para encontrar el indice Color
            System.out.println(col + " en el incice " + col.ordinal());

        }

        // Usando valueOf(). Devueve un objeto de Color con la constante dada.
        // La segunda línea comentada causa la excepción IllegalArgumentException.
        System.out.println(Color.valueOf("ROJO"));
        //System.out.println(Color.valueOf("BLANCO"));;

    }
}
