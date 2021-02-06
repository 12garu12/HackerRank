package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n = 3;
        int[] a = {3, 2, 1};
        int numberOfSwaps = 0;
        for (int i = 0; i < n; i++) {
            int greater = 0;
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    greater = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = greater;
                    numberOfSwaps++;
                }
            }
        }
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }
}
