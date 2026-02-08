package com.codingQuestions;

public class PalindromeNumber {
    public static  void main(String args[]) {
        int num = 345;
        int original = num;
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        System.out.println(rev);

        if (original == rev) {
            System.out.println("PalindromeNumber");
        } else {
            System.out.println("NotPalindromeNumber");
        }


    }
    }