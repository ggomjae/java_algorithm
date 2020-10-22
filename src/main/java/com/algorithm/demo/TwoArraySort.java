package com.algorithm.demo;

import java.util.Arrays;
import java.util.Comparator;

public class TwoArraySort {
    public static void main(String[] args){
        int[][] arr = {{1,2},{0,1},{3,2},{5,1},{5,0}};
        Arrays.sort(arr, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) return o1[1] - o2[1];
                else return o1[0] - o2[0];
            }
        });

        for(int i = 0 ; i < arr.length ; ++i){
            for(int j = 0 ; j < arr[i].length ; ++j){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
