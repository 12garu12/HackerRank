package com.company;

/*********************************************************************************************************************
 6. Métodos values(), ordinal() y valueOf()
 Todas las enumeraciones tienen automáticamente dos métodos predefinidos: values() y valueOf(). Sus formas generales
 se muestran aquí:

 public static tipo-enum[ ] values( )
 public static tipo-enum valueOf(String str)
 Estos métodos están presentes dentro de java.lang.Enum.
 El método values​​() se puede usar para devolver todos los valores presentes dentro de enum.
 El orden es importante en las enumeraciones. Al usar el método ordinal(), se puede encontrar cada índice de la
 constante enum, al igual que el índice de matriz.
 El método valueOf() devuelve la constante enum del valor de cadena especificado, si existe.
 Por ejemplo:
 */

public enum Color {

    ROJO, VERDE, AZUL;

}
