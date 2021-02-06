package com.company;

public class NodoArbol {
    public int dato;
    public String nombre;
    public NodoArbol hijoDerecho;
    public NodoArbol hijoIzquierdo;

    public NodoArbol(int d, String nom) {
        this.dato = d;
        this.nombre = nom;
        this.hijoDerecho = null;
        this.hijoIzquierdo = null;
    }

    @Override
    public String toString() {
        return nombre + " Su Dato es " + dato;
    }
}
