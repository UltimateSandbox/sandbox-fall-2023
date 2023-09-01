package org.example.calculator;

import java.util.Arrays;

public class Calculator {

    // vararg
    public int add(int a, int... b) {
        return a + Arrays.stream(b).sum();
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}
