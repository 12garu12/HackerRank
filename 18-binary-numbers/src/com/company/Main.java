package com.company;

import java.util.Scanner;

public class Main {

    static int maximum(int n) {
        String binary = Integer.toBinaryString(n);
        int i;
        int cont = 0;
        int result = 0;
        for (i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                cont++;
            } else {
                cont = 0;
            }
            if (result < cont) {
                result = cont;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();

        System.out.println(maximum(n));

    }
}
