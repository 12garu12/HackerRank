package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try {
            Integer number = Integer.parseInt(S);
            System.out.println(number);
        } catch (Exception e) {
            System.out.println("Bad String");
        }
    }
}
