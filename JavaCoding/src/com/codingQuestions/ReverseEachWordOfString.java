package com.codingQuestions;

public class ReverseEachWordOfString {
    public static void main(String[] args) {
        String str = " Hi I am Anjali Kumari";
        String[] words=str.split(" ");
        for(String word : words) {
            String rev = " ";
            for (int i = word.length() - 1; i >= 0; i--) {
                rev = rev + word.charAt(i);
            }
            System.out.print(rev);
        }
    }
}
