package com.javacoding;

public class RemoveVowels {
    public static void main(String[] args) {

        String str = "Anjali Kumari";
        String result = "";
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                result += ch;
            }
        }
        System.out.println("String without vowels: " + result);


    }
}
