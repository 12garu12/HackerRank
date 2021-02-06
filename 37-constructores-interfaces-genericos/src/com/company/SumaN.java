package com.company;

public class SumaN {

    private int suma;

    // Constructor
    <T extends Number> SumaN(T arg) {
        suma = 0;
        for (int i = 0; i <= arg.intValue(); i++) suma += i; // suma = 0.0 + 1.0 + 2.0 + 3.0 + 4.0 = 10
    }

    int getSuma() {
        return suma;
    }
}

class DesmoConstGen {
    public static void main(String[] args) {

        SumaN ob = new SumaN(4.0);
        System.out.println(ob.getSuma());
    }
}

/********************************************************************************************************************
 La clase SumaN calcula y encapsula la suma del valor numérico pasado a su constructor. Recuerde que la suma de N es
 la suma de todos los números enteros entre 0 y N. Debido a que SumaN especifica un parámetro de tipo que está
 limitado por Number, un objeto SumaN puede construirse usando cualquier tipo numérico, incluyendo Integer, Float o
 Double. No importa qué tipo numérico se use, su valor se convierte a Integer llamando a intValue(), y se calcula la
 suma. Por lo tanto, no es necesario que la clase SumaN sea genérica; sólo se necesita un constructor genérico.
 */