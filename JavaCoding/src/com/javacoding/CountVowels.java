package com.javacoding;

public class CountVowels {
    public static void main(String[] args) {

        String str = " Automation Testing";
       str= str.toLowerCase();
        int vowels=0;
        for (char ch : str.toCharArray()) {
        if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            vowels++;
        }
        }
        System.out.println("Vowels: " + vowels);

    }
}