package com.algorithm.demo;

import java.util.Stack;

public class PermutationTwo {


    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args){

        String str = "1234";
        boolean[] visited = new boolean[str.length()];
        StringBuilder sb = new StringBuilder();

        permutation(str,visited,sb);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
    static void permutation(String str, boolean[] visited, StringBuilder sb){

        boolean check = true;
        for(int i = 0 ; i < visited.length ; ++i){
            if(!visited[i]){
                check = false;
                break;
            }
        }
        if(check) return;

        for(int i = 0 ; i < visited.length ; ++i){
            if(visited[i] == false){
                sb.append(str.charAt(i));
                stack.push(Integer.parseInt(sb.toString()));
                visited[i] = true;
                permutation(str, visited, sb);
                visited[i] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
        }

    }
}
