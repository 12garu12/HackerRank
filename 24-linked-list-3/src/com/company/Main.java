package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        NodeLetter pointerFirst = null;
        //System.out.println("Numero de datos: ");
        Integer data = 4;
        char[] let = {'a', 'b', 'c', 'd'};

        int i;
        for (i = 0; i < data; i++) {
            char letter = let[i];
            pointerFirst = LetterMethod.insert(pointerFirst, letter);
        }
        LetterMethod.display(pointerFirst);
        in.close();
    }
}
