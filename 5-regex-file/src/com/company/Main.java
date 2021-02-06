package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner myObject = new Scanner(System.in);
        int cont = 0;
        while (myObject.hasNextLine()) {
            String data = myObject.nextLine();
            System.out.println(++cont + " " + data);
        }
    }
}
