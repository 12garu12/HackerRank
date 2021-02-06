package com.company;

public class LetterMethod {

    public static NodeLetter insert(NodeLetter pointerFirst, char letter) {
        NodeLetter pointerFst = new NodeLetter(letter);
        NodeLetter nextPointer = pointerFirst;
        if (pointerFirst == null) {
            pointerFirst = pointerFst;
            return pointerFirst;
        }
        while (nextPointer.nextpoint != null) {
            nextPointer = nextPointer.nextpoint;
        }
        nextPointer.nextpoint = pointerFst;
        return pointerFirst;
    }

    public static void display(NodeLetter pointerFirst) {
        NodeLetter inicio = pointerFirst;
        System.out.println("\n*******************************");
        while (inicio != null) {
            System.out.print(inicio.letter + " ");
            inicio = inicio.nextpoint;
        }
        System.out.println("\n*******************************");
    }


}
