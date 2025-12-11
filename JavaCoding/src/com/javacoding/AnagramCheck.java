package com.javacoding;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] arr = s1.toCharArray();
        char[] arr1 = s2.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        if (Arrays.equals(arr, arr1)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}


