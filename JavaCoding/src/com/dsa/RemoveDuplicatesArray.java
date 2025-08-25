package com.dsa;

import java.util.LinkedHashSet;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        int[] arr= {1, 2, 2, 3, 4, 4, 5};
        LinkedHashSet <Integer> set =new LinkedHashSet<>();
for(int num:arr){
    set.add(num);

}
for(int num:set){
    System.out.print(num + " ");
}

    }
}
