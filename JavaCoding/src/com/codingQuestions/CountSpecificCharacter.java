package com.codingQuestions;

public class CountSpecificCharacter {
    public static void main(String[] args) {
        String str = "Anjali";
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
            System.out.print("Total characters: " + count);


    }
}