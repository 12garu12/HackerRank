package com.company;

/*******************************************************************************************************************
 7. enum: Constructores, métodos, variables de instancia
 Es importante comprender que cada constante de enumeración es un objeto de su tipo de enumeración. Por lo tanto, una
 enumeración puede definir constructores, agregar métodos y tener variables de instancia.

 Cuando define un constructor para una enumeración, se llama al constructor cuando se crea cada constante de
 enumeración. Cada constante de enumeración puede llamar a cualquier método definido por la enumeración. Cada
 constante de enumeración tiene su propia copia de cualquier variable de instancia definida por la enumeración.

 enum puede contener constructor y se ejecuta por separado para cada constante enum en el
 momento de la carga de la clase enum.
 No podemos crear objetos enum explícitamente y, por lo tanto, no podemos invocar el constructor enum directamente.
 La siguiente versión de Transporte ilustra el uso de un constructor, una variable de instancia y un
 método. Da a cada tipo de transporte una velocidad típica:
 */

enum Transporte {

    COCHE(60), CAMION(50), AVION(600), TREN(70), BARCO(20);
    private int velocidad;

    // Añadir un constructor
    Transporte(int s) {
        velocidad = s;
    }

    // Añadir un metodo
    int getVelocidad() {
        return velocidad;
    }

}

class Enumerados {

    public static void main(String[] args) {

        Transporte tp;

        // Mostrar la velocidad de un avion
        System.out.println("La velocidad de un avion es: " +
                Transporte.AVION.getVelocidad() + " millas por hora. \n");

        // Mostrar todos las velocidades y transportes
        System.out.println("Todas las velocidades de transporte: ");
        for (Transporte t : Transporte.values()) {
            System.out.println(t + ": velocidad típica es " + t.getVelocidad() + " millas por hora. ");
        }

    }

}
