package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][6];
        arr = new int[][]{{-1, -1, 0, -9, -2, -2},
                {-2, -1, -6, -8, -2, -5},
                {-1, -1, -1, -2, -3, -4},
                {-1, -9, -2, -4, -4, -5},
                {-7, -3, -3, -2, -9, -9},
                {-1, -3, -1, -2, -4, -5}};
        int suma = 0;
        int total = 0;
        int negativo = -63;

        /*for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }*/
        for (int k = 0; k <= 3; k++) {
            for (int z = 0; z <= 3; z++) {
                suma = arr[k][z] + arr[k][z + 1] + arr[k][z + 2] +
                        arr[k + 1][z + 1] +
                        arr[k + 2][z] + arr[k + 2][z + 1] + arr[k + 2][z + 2];
                if (total < suma) {
                    total = suma;
                } else if (suma <= 0) {
                    if (negativo < suma) {
                        negativo = suma;
                    }
                }
            }
        }
        if (total > 0) {
            System.out.println(total);
        } else {
            System.out.println(negativo);
        }

    }
}
