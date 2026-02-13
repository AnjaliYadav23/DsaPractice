package com.codingQuestions;

public class CountVowels {
    public static void main(String[] args){
        String str= "Anjali";
       str= str.toLowerCase();
       int count=0;
        for(int i=str.length()-1;i>=0 ;i--){
            char ch=str.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println(ch);
                count++;
            }
        }
        System.out.println("vowels"+ count);

    }
}
