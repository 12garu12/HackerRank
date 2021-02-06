package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        DeDos dosOb = new DeDos();
        DeTres tresOb = new DeTres();
        Series ob;

        for (int i = 0; i < 5; i++) {
            ob = dosOb;
            System.out.println("Siguiente valor DeDos es: " + ob.getSiguiente());
            ob = tresOb;
            System.out.println("Siguiente valor Detres es: " + ob.getSiguiente());
        }








        /*DeDos ob = new DeDos();

        for (int i = 0; i < 5; i++){
            System.out.println("Siguiente valor es : " + ob.getSiguiente());
        }

        System.out.println("\nReiniciando");
        ob.reiniciar();

        for (int i = 0; i < 5; i++){
            System.out.println("Siguiente valor es: " + ob.getSiguiente());
        }

        System.out.println("\nIniciando en 100");
        ob.setComenzar(100);

        for (int i = 0; i < 5; i++){
            System.out.println("Siguiente valor es: " + ob.getSiguiente());
        }*/
    }
}
