package com.javacoding;

public class SwapNumbersWithoutUsingThirdVar {
    public static void main (String[] args) {
        int a=9;
        int b=10;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    }
