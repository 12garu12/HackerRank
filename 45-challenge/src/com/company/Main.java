package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int c = 17;
        long a = (long) Math.pow(7, c - 1);
        int b = (int) (a % c);
        System.out.println(a);
        System.out.println(b);
    }
}
