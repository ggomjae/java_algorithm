package com.algorithm.demo;

public class StringBuilderAlphabet {
    public static void main(String[] args) {

       /*
            여기서 sout 결과 bcde가 출력되고 String Type이 아닌 StringBuilder 타입이 나온다.
         */
        StringBuilder sb = new StringBuilder("abcde");
        System.out.println(sb.deleteCharAt(0));
        String tmp_str = sb.deleteCharAt(0).toString();
        System.out.println(tmp_str);   // 결과는 cde

        System.out.println('a'-'A');  // 32
        char tmp_char = 'a' - 'A';
        int tmp_int = 'a' - 'A';
        System.out.println(tmp_char); // 안나옴
        System.out.println(tmp_int);  // 32

        tmp_char += 'A';
        System.out.println(tmp_char);  // a가 나옴

        tmp_int += 'A';
        System.out.println(tmp_int);   // 97이 나옴

        char tmp_char = 'a';
        tmp_char += 1;
        System.out.println(tmp_char); // b가 출력된다.

        tmp_char += 24;
        System.out.println(tmp_char); // z가 출력된다.

        /*
            여기서 +1을 더하면 z -> { 가 되므로 원하고자하는 것은 a가 되야한다.
            좋은 방법은 ?
         */

        if(++tmp_char > 'z') tmp_char -= ('z' - 'a' + 1);
        System.out.println(tmp_char);


    }
}
