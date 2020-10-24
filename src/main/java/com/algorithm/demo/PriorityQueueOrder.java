package com.algorithm.demo;

import java.util.PriorityQueue;

public class PriorityQueueOrder {

    public static class Node implements Comparable<Node>{
        int number;
        int twoNumber;

        public Node(int number, int twoNumber){
            this.number = number;
            this.twoNumber = twoNumber;
        }

        @Override
        public int compareTo(Node node) {
            if(this.number == node.number) return -(this.twoNumber - node.twoNumber);
            return -(this.number - node.number);
        }
    }

    public static void main(String[] args){
        PriorityQueue<Node> pq = new PriorityQueue<Node>();
        pq.offer(new Node(2,1));
        pq.offer(new Node(1,3));
        pq.offer(new Node(2,0));
        pq.offer(new Node(5,2));
        pq.offer(new Node(2,2));

        while(!pq.isEmpty()){
            Node node = pq.poll();
            System.out.print(node.number);
            System.out.print(node.twoNumber);
            System.out.println();
        }

        return ;
    }
}
