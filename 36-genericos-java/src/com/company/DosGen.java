package com.company;

public class DosGen<T, V> {

    // Usa dos parámetros de tipo
    T ob1;
    V ob2;

    // Pase al constructor una referencia a un objeto de tipo T y V
    public DosGen(T o1, V o2) {
        this.ob1 = o1;
        this.ob2 = o2;
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }

    // Muesotra el tipo de dato de T y V
    void mostrarTipo() {
        System.out.println("El tipo de T es: " + ob1.getClass().getName());
        System.out.println("El tipo de V es: " + ob2.getClass().getName());
    }
}

// Demostracion de la clase DosGen
class Genericos2 {

    public static void main(String[] args) {

        DosGen<Integer, String> dosgen = new DosGen<>(28, "Genericos");

        // Mostrar los tipos de datos
        dosgen.mostrarTipo();

        // Obtener y mostrar los valores
        int v = dosgen.getOb1();
        System.out.println("Valor: " + v);

        String str = dosgen.getOb2();
        System.out.println("Valor: " + str);


    }

}

