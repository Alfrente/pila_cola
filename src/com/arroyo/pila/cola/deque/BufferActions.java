package com.arroyo.pila.cola.deque;

import java.util.Deque;
import java.util.LinkedList;

public class BufferActions {
    Deque<String> bufferActions = new LinkedList<>();
    Deque<String> redoActions = new LinkedList<>();

    public void doAction(String action){
        System.out.println(action);
        insertActionsInBuffer(action);
        System.out.println(bufferActions);
    }

    private void insertActionsInBuffer(String action){
        bufferActions.offerLast(action);
    }

    public void undo(){
        if (bufferActions.isEmpty())
            return;
            System.out.println("Undo");
            String action = bufferActions.pollLast();
            redoActions.push(action);
            System.out.println(bufferActions);

    }

    public void redo(){
        System.out.println("Redo");
        String action = redoActions.pop();
        insertActionsInBuffer(action);
        System.out.println("Redo action: " + redoActions);
        System.out.println(bufferActions);
    }

    public static void main(String[] args) {
        BufferActions buffer=new BufferActions();
        buffer.doAction("Copiar");
        buffer.doAction("Pegar");
        buffer.doAction("Escribir Hola");
        buffer.doAction("Borrar");
        buffer.undo();
        buffer.undo();
        buffer.redo();
    }
}
