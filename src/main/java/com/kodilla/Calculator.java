package com.kodilla;

public class Calculator {

    static void addition(int a, int b) {
        int sum = 0;
        sum = a + b;
        System.out.println(sum);
    }

    static void subtraction(int a, int b) {
        int sub = 0;
        sub = a - b;
        System.out.println(sub);
    }

    public static void main(String[] args) {
        addition(10, 15);
        subtraction(25, 38);
    }

}
