package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, String> phoneNumbers = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            String phne = Integer.toString(phone);
            phoneNumbers.put(name, phne);
        }
        while (in.hasNext()) {
            String s = in.next();
            if (phoneNumbers.containsKey(s)) {
                System.out.println(s + "=" + phoneNumbers.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
        ;
    }
}
