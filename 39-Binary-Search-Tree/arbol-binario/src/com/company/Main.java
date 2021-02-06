package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int opcion = 0;
        int elemento;
        String nombre;

        ArbolBinario arbolito = new ArbolBinario();


        do {
            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un Nodo\n" +
                                "2. Recorreer el Árbol InOrden\n" +
                                "3. Salir\n" +
                                "Elige una opción...", "Árboles Binarios",
                        JOptionPane.QUESTION_MESSAGE));

                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el Numero del Nodo...", "Agregando Nodo",
                                JOptionPane.QUESTION_MESSAGE));
                        nombre = JOptionPane.showInputDialog(null,
                                "Ingresa el nombre del Nodo....", "Agregando Nodo",
                                JOptionPane.QUESTION_MESSAGE);

                        arbolito.agregarNodo(elemento, nombre);

                        break;
                    case 2:
                        if (!arbolito.estaVacio()) {
                            arbolito.inOrden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El Árbol esta vacio ",
                                    "¡Cuidado!",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }

                    case 3:
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada", "Fin",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta", "Warning",
                                JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "error " + n.getMessage());
            }
        } while (opcion != 3);

    }
}
