package com.company;

public class BST {

    Nodo raiz;

    public BST() {
        raiz = null;
    }

    // inorder tree walk
    public void recorrido_en_orden(Nodo x) {
        if (x != null) {
            recorrido_en_orden(x.izq);
            System.out.println(x.llave);
            recorrido_en_orden(x.der);
        }
    }

    // Validar si el arbol esta vacio
    public boolean arbolVacio() {
        return raiz == null;
    }

    // Método para recorrer el Árbol PreOrden
    public void preOrden(Nodo x) { // metodo recorre toda la rama izquierda partiendo desde la raiz despues recorre la rama derecha
        if (x != null) {
            System.out.println(x.llave);
            preOrden(x.izq);
            preOrden(x.der);
        }
    }

    // Método para recorrer lel árbol PostOrden
    public void postOrden(Nodo x) { // recorre toda la rama izquierda y la imprime y de ahi toda la rama derecha y la imprime y por ultimo imprime la raiz
        if (x != null) {
            postOrden(x.izq);
            postOrden(x.der);
            System.out.println(x.llave);
        }
    }


    public void insertar(int key, Object valor) {
        Nodo n = new Nodo(key);
        n.valor = valor;

        if (raiz == null) {
            raiz = n;
        } else {
            Nodo temporal = raiz;
            while (temporal != null) {

                n.p = temporal;

                if (n.llave >= temporal.llave) {
                    temporal = temporal.der;
                } else {
                    temporal = temporal.izq;
                }
            }

            if (n.llave < n.p.llave) {
                n.p.izq = n;
            } else {
                n.p.der = n;
            }
        }
    }

    private class Nodo {

        public Nodo p; // Nodo padre
        public Nodo der; // Nodo derecho hijo
        public Nodo izq; // Nodo izquierdo hijo
        public int llave;
        public Object valor;

        public Nodo(int key) {
            this.llave = key;
            this.der = null;
            this.izq = null;
            this.p = null;
            this.valor = null;
        }

    }
}
