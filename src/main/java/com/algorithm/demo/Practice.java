package com.algorithm.demo;

import java.sql.SQLOutput;
import java.util.*;

import static java.util.Arrays.*;

public class Practice {

    public static class Node implements Comparable<Node>{
        int number;
        Node leftNode;

        public Node(int number){
            this.number = number;
        }

        @Override
        public int compareTo(Node node){
            return this.number - node.number;
        }
    }

    public static void main(String[] args) throws Exception {




//        String s = "";
//        System.out.println(s.isEmpty());
//        System.out.println(s.equals(""));

//        HashSet<Integer> hashSet = new HashSet<>();
//        hashSet.add(1);
//        hashSet.add(3);
//        hashSet.add(2);
//        List<Integer> list = new ArrayList<>();
//        list.addAll(hashSet);
//
//        for(int i : list) System.out.println(i);

//        Map<String,Integer> map = new HashMap<>();
//        map.put("min",3);
//        map.put("kyung",4);
//        HashSet<String> hs = new HashSet<>();
//
//        Iterator<String> iter = map.keySet().iterator();
//
//        while(iter.hasNext()){
//            String s = iter.next();
//            System.out.println(map.get(s));
//        }



//        Node node = new Node(3);
//        System.out.println(node.leftNode);

//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        pq.offer(3);
//        pq.offer(2);
//        pq.offer(10);
//        pq.offer(9);
//
//        pq.remove(2);
//        while(!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }

//        List<Node> list = new ArrayList<>();
//        list.add(new Node(2));
//        list.add(new Node(3));
//        list.add(new Node(1));
//
//        Collections.sort(list);
//        for(int i = 0 ; i < list.size() ; ++i){
//            System.out.println(list.get(i).number);
//        }

//        List<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        System.out.println(arr.get(2));
//        arr.remove(1);
//        System.out.println(arr.size());
//        for(int i = 0 ; i < arr.size() ; ++i){
//            System.out.println(arr.get(i));
//        }
//        arr.add(1,10);
//        for(int i = 0 ; i < arr.size() ; ++i){
//            System.out.print(arr.get(i));
//        }
//        String str = "abcde";
//        String temp = "abc";
//        System.out.println(str.startsWith(temp));

//        int[] arr = new int[10];
//        Arrays.fill(arr,3);
//        System.out.println(arr[0]);

//        String str = "abc-abfgd-wet";
//        String[] arr = str.split("-");
//        for(String s : arr){
//            if( s.length() != 3) System.out.println(s);
//        }
//
//        Set<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(2);
//
//        for(int i : set){
//            System.out.println(i);
//        }
//        Map<String, Integer> map = new HashMap<>();
//        map.put("bb",3);
//        map.put("ar",2);
//        String s = "abc";
//        StringBuilder sb = new StringBuilder(s);
//        sb.append(2);
//        System.out.println(sb.toString());
//        return ;
//        Queue<Integer> q = new LinkedList<>();
//        q.offer(1);
//        q.offer(2);
//        Iterator<Integer> itr = q.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
//        return ;


        return ;
    }
}
