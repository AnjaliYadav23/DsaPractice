package com.dsa;

public class RemoveWhiteSpace {
    public static void  main(String[] args) {
        String str= " A n j a l i";
        System.out.println(str.replaceAll("\\s+",""));
    }
}

