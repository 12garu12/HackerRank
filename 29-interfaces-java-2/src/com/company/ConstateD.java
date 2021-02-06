package com.company;

import java.io.FileOutputStream;

public class ConstateD implements Constante {

    public static void main(String[] args) {
        int numeros[] = new int[MAX];

        for (int i = 0; i < 11; i++) {
            if (i >= MAX) System.out.println(MSJERROR);
            else {
                numeros[i] = i;
                System.out.println(numeros[i] + " ");
            }
        }
    }
}
