package com.codingQuestions;

public class VowelsConsonantsPrint {
    public static void main(String[] args) {
        String str = "Anjali";
        str = str.toLowerCase();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if ('a' <= ch && 'z' >= ch) {
                if ("aeiou".indexOf(ch)!= -1) {
                    System.out.println(ch + " -> Vowel");
                } else {
                    System.out.println(ch + " -> Consonant");
                }
                }
            }
        }
    }
