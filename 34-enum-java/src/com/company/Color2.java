package com.company;

/*********************************************************************************************************************
 9. enum y Métodos
 enum puede contener métodos concretos, es decir, no tiene ningún método abstracto (abstract).
 Por ejemplo:
 */

enum Color2 {

    ROJO, VERDE, AZUL;

    // enum constructor llamado por separado para cada constante
    private Color2() {
        System.out.println("Constructor llamado para: " + this.toString());
    }

    // Solo metodos concretos (no abstractos) permitidos
    public void colorInfo() {
        System.out.println("Color universal");
    }
}

class Test2 {


    // Metodo
    public static void main(String[] args) {

        Color2 c1 = Color2.ROJO;
        System.out.println(c1);
        c1.colorInfo();
    }
}


