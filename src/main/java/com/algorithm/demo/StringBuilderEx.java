package com.algorithm.demo;

public class StringBuilderEx {

    public static void main(String[] args){
        // 이런식으로 초기화 가능
        String str = "aabbccddeeff";
        StringBuilder sb = new StringBuilder(str);

        sb.deleteCharAt(1);
        System.out.println(sb.toString()); // 결과는 acde

        // 삭제하면 그 자리에 뒤에있는 것이 당겨지는 것임.
        for(int i = 0 ; i < sb.length() ; ++i) System.out.println(sb.charAt(i));

        sb.delete(1,2); // 개수가 아니라 1부터 2까지네
        System.out.println(sb.toString()); // 결과는 ade가 나옴.
        System.out.println("----------------------");
        char position = 'A';
        for(int i = 0 ; i < sb.length() ; ++i){
            if(position == sb.charAt(i)){
                sb.delete(i-1,i+1);
                i -= 2;
            }else{
                position = sb.charAt(i);
            }
        }

        System.out.println(sb.toString());
    }
}
