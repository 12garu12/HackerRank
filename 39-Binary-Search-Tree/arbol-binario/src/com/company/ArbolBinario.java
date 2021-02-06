package com.company;

public class ArbolBinario {

    NodoArbol raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    // Metodo para insertar un Nodo en el Árbol
    public void agregarNodo(int d, String nom) {

        NodoArbol nuevo = new NodoArbol(d, nom);

        if (raiz == null) {
            raiz = nuevo;
        } else {
            NodoArbol auxiliar = raiz;
            NodoArbol padre = auxiliar;
            while (true) {
                padre = auxiliar;
                if (d < auxiliar.dato) {
                    auxiliar = auxiliar.hijoIzquierdo;
                    if (auxiliar == null) {
                        padre.hijoIzquierdo = nuevo;
                        return;
                    }
                } else {
                    auxiliar = auxiliar.hijoDerecho;
                    if (auxiliar == null) {
                        padre.hijoDerecho = nuevo;
                        return;
                    }
                }
            }
        }
    }

    // Método para saber cuando el arbol esta vacio
    public boolean estaVacio() {
        return raiz == null;
    }

    // Metodo para recorrer el Árblo InOrden
    public void inOrden(NodoArbol r) {
        if (r != null) {
            inOrden(r.hijoIzquierdo);
            System.out.println(r.dato);
            inOrden(r.hijoIzquierdo);
        }
    }

}
