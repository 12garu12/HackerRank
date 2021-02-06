package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        Integer T = in.nextInt();
        String S, strEven, strOdd;

        for (int i = 0; i < T; i++) {
            S = in.next();
            strEven = "";
            strOdd = "";
            for (int j = 0; j < S.length(); j++) {
                if (j % 2 == 0) {
                    strEven += S.charAt(j);
                } else {
                    strOdd += S.charAt(j);
                }
            }
            System.out.println(strEven + " " + strOdd);
        }
    }
}
