package com.company;

public class DeDos implements Series {

    int iniciar;
    int valor;
    int anterior;

    public DeDos() {
        iniciar = 0;
        valor = 0;
    }

    public int getSiguiente() {
        valor += 2;
        return valor;
    }

    public void reiniciar() {
        valor = iniciar;
    }

    public void setComenzar(int x) {
        iniciar = x;
        valor = x;
    }

    // Añadiendo un método que no estaba definido en Series
    int getAnterior() {
        return anterior;
    }

}
