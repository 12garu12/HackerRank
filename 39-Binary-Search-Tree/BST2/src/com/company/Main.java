package com.company;

public class Main {

    public static void main(String[] args) {

        BTS tree = new BTS();

        tree.insert(8, "nodo 1");
        tree.insert(9, "nodo 2");
        tree.insert(6, "nodo 3");
        tree.insert(4, "nodo 4");
        tree.insert(8, "nodo 5");
        tree.insert(3, "nodo 6");
        tree.insert(2, "nodo 7");

        tree.tourInOrder(tree.root);

    }
}
