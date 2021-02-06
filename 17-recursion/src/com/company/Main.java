package com.company;

public class Main {

    static int factorial(int n) {
        if (n <= 1) {
            return n;
        }
        return n * factorial(n - 1);
    }


    public static void main(String[] args) {
        // write your code here

        System.out.println(factorial(4));

    }
}
