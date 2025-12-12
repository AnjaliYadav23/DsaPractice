package com.javacoding;

public class CountWords {
    public static void main(String[] args) {

        String str = "I love Java programming";
        String[] words = str.trim().split("\\s+");
        System.out.println("Word count: " + words.length);
    }
}