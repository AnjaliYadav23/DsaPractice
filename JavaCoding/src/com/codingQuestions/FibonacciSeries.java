package com.codingQuestions;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 5;
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 1; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}