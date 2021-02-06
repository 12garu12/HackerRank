package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor escriba el numero par el cual quiere los 10 primeros multiplos! ");
        int N = scan.nextInt();
        scan.close();
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }

    }
}
