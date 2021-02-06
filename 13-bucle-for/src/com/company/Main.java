package com.company;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here

        int n = scanner.nextInt();

        scanner.close();

        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

    }
}
