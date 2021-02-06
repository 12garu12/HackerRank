package com.company;

/**********************************************************************************************************************
 2. Un ejemplo simple de genéricos
 Antes de discutir cualquier otra teoría, es mejor mirar un simple ejemplo de genéricos. El siguiente programa
 define dos clases. El primero es la clase genérica Gen, y el segundo es Genericos, que usa Gen.
 */
class Gen<T> {

    // T es el parámetro de tipo genérico.
    T ob;

    // Pase al constructor una referencía a un objeto de tipo T
    Gen(T o) {
        this.ob = o;
    }

    T getOb() {
        return ob;
    }

    // Muestra el tipo de T
    void mostrarTipo() {
        System.out.println("El tipo de T es: " + ob.getClass().getName());
    }
}

class Genericos {

    public static void main(String[] args) {

        // Crear una referencia Gen para Integers.
        Gen<Integer> iOb;

        //Cree un objeto Gen<Integer> y asigne su referencia a iOb.
        //Observe el uso de autoboxing para encapsular el valor 28 dentro de un objeto Interger.
        iOb = new Gen<>(28);

        // Muestra el tipo de dato utilizado por iOb.
        iOb.mostrarTipo();

        int v = iOb.getOb();
        System.out.println("Valor: " + v + "\n");

        //Cree un objeto Gen para Strings.
        Gen<String> strOb = new Gen<>("Prueba de genericos");

        //Muestra el tipo de dato utilizado por strOb.
        strOb.mostrarTipo();

        //Obtenga el valor de strOb.
        //De nuevo, note que no se necesita de conversión.
        String str = strOb.getOb();
        System.out.println("Valor: " + str);

    }


}
