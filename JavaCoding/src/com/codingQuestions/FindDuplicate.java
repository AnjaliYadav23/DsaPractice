package com.codingQuestions;

import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] args) {

        String str = "Anjali".toLowerCase();
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> duplicate = new HashSet<>();

        for(char ch : str.toCharArray()){

            if(!set.add(ch)){
                duplicate.add(ch);
            }
        }

        System.out.println("Duplicates: " + duplicate);
    }
}
