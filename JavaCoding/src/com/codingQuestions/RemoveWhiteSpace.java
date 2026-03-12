package com.lnctu.JavaCoding.src.com.codingQuestions;

public class RemoveWhiteSpace {
    public static void  main(String[] args) {
        String str= "c o l l e ge";
        System.out.println(str.replaceAll("\\s+",""));
    }
}

