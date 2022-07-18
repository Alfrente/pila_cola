package com.arroyo.pila.cola;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class StringPriorityQueue {
    public static void main(String[] args) {
        Queue<String> queue=new PriorityQueue<>();
        queue.add("java");
        queue.add("c++");
        queue.add("c#");
        queue.add("A-go");

        System.out.println("queue = " + queue);

        String elementoDesencolado = queue.poll();
        System.out.println("elementoDesencolado = " + elementoDesencolado);
        System.out.println("Despues de remover");
        Iterator<String> ite= queue.iterator();

        while (ite.hasNext()){
            System.out.print(ite.next() + ", ");
        }

        System.out.println("despues de remover c#");
        queue.remove("c#");
        Iterator<String> ite2= queue.iterator();

        while (ite2.hasNext()){
            System.out.print(ite2.next() + ", ");
        }

        boolean b = queue.contains("java");
        System.out.println("\nb = " + b);

        Object[] letra = queue.toArray();
        System.out.println("letra = " + letra.length);

    }
}
