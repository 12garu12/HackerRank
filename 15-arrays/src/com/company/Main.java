package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];
        String arrReverse = "";

        String[] arrItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        for (int i = (n - 1); i >= 0; i--) {
            arrReverse += arr[i] + " ";
        }
        System.out.print(arrReverse);

        scanner.close();

    }
}
