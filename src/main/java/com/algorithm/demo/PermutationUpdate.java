package com.algorithm.demo;

import java.util.ArrayList;
import java.util.List;

public class PermutationUpdate {
    public static int result;

    public static void main(String[] args) {

        List<String> arr = new ArrayList<>();
        arr.add("1");
        arr.add("2");
        arr.add("3");
        arr.add("4");
        List<String> result = new ArrayList<>();
        System.out.println("nPr");
        reculsionOne(arr, result, arr.size(), 2);
        System.out.println("-------------------------------");
        System.out.println("nCr");
        reculsionTwo(arr, result, 0, arr.size(), 2);
    }


    private static void reculsionOne(List<String> arr, List<String> result,  int n, int r) {

        if (r == 0) {

            System.out.println(result.toString());
            return;
        }

        for (int i = 0; i < n; i++) {

            result.add(arr.remove(i));
            reculsionOne(arr, result, n - 1, r - 1);
            arr.add(i, result.remove(result.size() - 1));
        }
    }

    private static void reculsionTwo(List<String> arr, List<String> result, int index, int n, int r) {

        if (r == 0) {

            System.out.println(result.toString());
            return;
        }

        for (int i = index; i < n; i++) {

            result.add(arr.get(i));
            reculsionTwo(arr, result, i + 1, n, r - 1);
            result.remove(result.size() - 1);
        }
    }
}
