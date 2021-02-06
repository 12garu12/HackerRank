package com.company;

import org.w3c.dom.ls.LSParserFilter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int series[] = new int[n];
            String seriesStr = "";
            series[0] = (int) (a + Math.pow(2, 0) * b);
            seriesStr += series[0] + " ";
            for (int c = 1; c < n; c++) {
                series[c] = (int) (series[c - 1] + Math.pow(2, c) * b);
                seriesStr += series[c] + " ";
            }
            System.out.println(seriesStr);
        }
        in.close();
    }
}
