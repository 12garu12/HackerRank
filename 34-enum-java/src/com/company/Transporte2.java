package com.company;

/**********************************************************************************************************************
 8. Enum y Herencia
 ×Hay dos restricciones que se aplican a las enumeraciones. Primero, una enumeración no puede heredar otra clase. En
 segundo lugar, una enumeración no puede ser una superclase.
 Esto significa que una enumeración no se puede extender. De lo contrario, enum actúa como cualquier otro tipo
 de clase. La clave es recordar que cada una de las constantes de enumeración es un objeto de la clase en la
 que está definida.

 Aunque no puede heredar una superclase al declarar una enumeración, todas las enumeraciones heredan
 automáticamente una: java.lang.Enum. Esta clase define varios métodos que están disponibles para el uso de todas
 las enumeraciones.
 Muy a menudo, no necesitará usar estos métodos, pero hay dos que puede emplear ocasionalmente: ordinal() y compareTo().
 El método toString() se reemplaza en la clase java.lang.Enum, que devuelve el nombre de la constante enum.
 enum puede implementar muchas interfaces.
 8.1. Uso de ordinal( ) y compareTo()
 El método [java]ordinal()[/java] se muestra aquí:

 final int ordinal()
 Devuelve el valor ordinal de la constante invocadora. Los valores ordinales comienzan en cero. Por lo tanto, en la
 enumeración Transporte, COCHE tiene un valor ordinal de cero, CAMION tiene un valor ordinal de 1, AVION tiene un
 valor ordinal de 2, y así sucesivamente.

 Puede comparar el valor ordinal de dos constantes de la misma enumeración utilizando
 el método [java]compareTo()[/java]. Tiene esta forma general:

 final int compareTo(tipo-enum e)
 Aquí, tipo-enum es el tipo de enumeración y e es la constante que se compara con la constante de
 invocación. Recuerde, tanto la constante de invocación como e deben ser de la misma enumeración. Si la constante
 de invocación tiene un valor ordinal menor que e, entonces compareTo() devuelve un valor negativo. Si los dos
 valores ordinales son iguales, se devuelve cero. Si la constante de invocación tiene un valor ordinal mayor que e,
 se devuelve un valor positivo.

 El siguiente programa muestra ordinal() y compareTo():
 */

public enum Transporte2 {

    COCHE, CAMION, AVION, TREN, BARCO;
}

class Enumerados2 {

    public static void main(String[] args) {

        Transporte2 tp, tp2, tp3;

        // Obtenga todos los valores ordinales usando el metodo ordinal().
        System.out.println("Aquí están todas las constantes de transporte y sus valores ordinales: ");
        for (Transporte2 t : Transporte2.values()) {
            System.out.println(t + " " + t.ordinal());
        }

        tp = Transporte2.AVION;
        tp2 = Transporte2.TREN;
        tp3 = Transporte2.AVION;

        System.out.println();

        // Usando el metodo Compareto().
        if (tp.compareTo(tp2) < 0) {
            System.out.println(tp + " llega antes que " + tp2);
        }

        if (tp.compareTo(tp2) > 0) {
            System.out.println(tp2 + " llega antes que " + tp);
        }

        if (tp.compareTo(tp3) == 0) {
            System.out.println(tp + " es igual que " + tp3);
        }

    }
}
