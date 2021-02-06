package com.company;

import java.util.Scanner;

public class Main {
    static boolean flag = false;
    static int B = 0;
    static int H = 0;

    static {
        try {
            Scanner in = new Scanner(System.in);
            B = in.nextInt();
            H = in.nextInt();
            if (B > 0 && H > 0) {
                flag = true;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println(e + ": Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        // write your code here
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }

}
