package com.company;

public class Student extends Person {

    private int[] testScores;

    public Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    public char calculate() {
        char letter;
        int sumScores = 0;
        for (int scores : testScores) {
            sumScores += scores;
        }
        int average = sumScores / testScores.length;
        if (average >= 90 && average <= 100) {
            letter = 'O';
        } else if (average >= 80 && average < 90) {
            letter = 'E';
        } else if (average >= 70 && average < 80) {
            letter = 'A';
        } else if (average >= 55 && average < 70) {
            letter = 'P';
        } else if (average >= 40 && average < 55) {
            letter = 'D';
        } else {
            letter = 'T';
        }
        return letter;
    }
}

