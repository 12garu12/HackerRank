package com.company;

public class Calculator {

    public int power(int a, int b) {
        if (a < 0 || b < 0) {
            throw new ArithmeticException("n and p should be non-negative");
        } else {
            int result = (int) (Math.pow(a, b));
            return result;
        }
    }
}
