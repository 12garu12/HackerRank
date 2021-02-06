package com.company;

/******************************************************************************************************************
 6.2. Compatibilidad de tipo
 Los tipos delimitados son especialmente útiles cuando necesita asegurarse de que un parámetro de tipo sea compatible
 con otro. Por ejemplo, considere la siguiente clase llamada Pareja, que almacena dos objetos que deben ser compatibles
 entre sí:
 */

public class Pareja<T, V extends T> {

    T primero;
    V segundo;

    Pareja(T a, V b) {
        primero = a;
        segundo = b;
    }
}

/**********************************************************************************************************************
 Observe que Pareja usa dos parámetros de tipo, T y V, y que V extiende de T. Esto significa que V será igual a T o
 una subclase de T. Esto asegura que los dos argumentos para el constructor de Pareja serán objetos del mismo tipo
 o de tipos relacionados. Por ejemplo, las siguientes construcciones son válidas:
 */

class DemoPareja {

    public static void main(String[] args) {

        // Esto esta bien porque tanto T como V son Integer.
        Pareja<Integer, Integer> x = new Pareja<Integer, Integer>(1, 2);

        // Esto está bien porque Integer Tambien es una subclase de Number.
        Pareja<Number, Integer> y = new Pareja<Number, Integer>(10.4, 12);

        // Esto causa un error porque String no es una subclase de Number
        //Pareja<Number, String> z = new Pareja<Number, String>(10.4, "12");  // En este caso, String no es una
        // subclase de Number, que viola el límite especificado por Pareja.

    }
}
