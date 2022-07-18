package com.arroyo.pila.cola;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();

        for (int i=0; i<5; i++){
            queue.add(i);
            //queue.offer(i); se utiliza cuando la cola tiene una tamano fijo
            // para que no de error o una exepcion
        }

        System.out.print("Elemento de la cola " + queue +"\n");
        int head = queue.remove();
        //int head = queue.poll(); sirve para eliminar tambien
        System.out.println("La cabecera de la cola " + head + "\n");

        System.out.println("Elemtos de la cola despues de eliminar la cabeza " + queue + "\n");

        int size = queue.size();
        System.out.println("size = " + size);

        System.out.println("Cabecera de la cola " + queue.peek() + "\n");

    }
}
