package com.javacoding;

import java.util.HashMap;

public class CharFrequency {
    public static void main(String[] args) {

        String str = "hello";
        HashMap<Character,Integer> map =new HashMap<>();
        for(char ch: str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        System.out.println("Character frequency: " + map);

    }
}
