package com.in60minutes.collections;

//Creation of a queue
//Addition of elements into the queue
//Retrieval of elements from the queue
//Deletion of elements from the queue
//Verification of elements in the queue

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q1 = new PriorityQueue<>();

        //Addition - offer,add

        q1.offer(34);
        q1.add(48);
        q1.add(21);
        System.out.println(q1);

        //retrival - peek

        System.out.println(q1.peek());
        //Removal - poll,remove

        System.out.println(q1.poll());
        System.out.println(q1);

        ArrayDeque<Integer> q2 = new ArrayDeque<>();

        //Addition -offer,offerFirst,offerLast,add,addFirst,addLast,addAll
        //retrieval - peek, peekFirst,peekLast
        //delete - poll pollFirst,pollLast, remove, removeFirst,removeLast

        q2.offer(24);
        q2.add(34);
        q2.offerFirst(36);
        q2.addLast(63);
        System.out.println(q2);

        System.out.println(q2.pollLast());
        System.out.println(q2.removeFirst());

    }
}
