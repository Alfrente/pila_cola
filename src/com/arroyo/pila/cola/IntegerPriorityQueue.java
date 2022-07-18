package com.arroyo.pila.cola;

import java.util.PriorityQueue;

public class IntegerPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue=new PriorityQueue<>();

        queue.add(10);
        queue.add(20);
        queue.add(15);
        System.out.println("queue = " + queue);
        queue.forEach(System.out::println);

        System.out.println("Elemento eliminado " + queue.poll());
        System.out.println("queue = " + queue);
        queue.forEach(System.out::println);

    }
}
