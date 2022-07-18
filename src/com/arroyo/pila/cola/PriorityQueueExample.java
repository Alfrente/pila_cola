package com.arroyo.pila.cola;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> numeros = new PriorityQueue<>();
        // a c b g e
        // 0 8 6 1 2
        numeros.add(0);
        numeros.add(8);
        numeros.add(6);
        numeros.add(1);
        numeros.add(2);

        System.out.println("numeros = " + numeros);

        System.out.println("Numeros sin la cabecera " + numeros.poll());
        System.out.println(numeros);
    }
}
