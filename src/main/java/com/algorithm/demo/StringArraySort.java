package com.algorithm.demo;

import java.util.Arrays;

public class StringArraySort {
    public static void main(String[] args){
        String[] str = {"123","1234","52341","12","234"};

        for(String s : str){
            System.out.println(s);
        }

        Arrays.sort(str);

        System.out.println("------------------------");
        for(String s : str) {
            System.out.println(s);
        }
    }
}
