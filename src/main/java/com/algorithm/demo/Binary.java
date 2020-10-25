package com.algorithm.demo;

public class Binary {
    public static void main(String[] args){
        int n = 2;
        String s = binaryFunction(n, 9);
        System.out.println(s);
        return ;
    }
    public static String binaryFunction(int n, int number){
        StringBuilder sb = new StringBuilder();
        while(number != 0){
            int remain = number % n;
            number = number / n;
            sb.append(Integer.toString(remain));
        }
        return sb.reverse().toString();
    }
}
