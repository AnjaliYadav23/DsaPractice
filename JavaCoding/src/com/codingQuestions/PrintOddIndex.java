package com.codingQuestions;

public class PrintOddIndex {
    public static void main(String[] args) {
        String str = "Anjali";
        for (int i = 0; i < str.length(); i++) {
            if(i%2!=0){
                System.out.println(str.charAt(i));
            }
        }
    }
}
