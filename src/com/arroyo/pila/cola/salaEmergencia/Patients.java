package com.arroyo.pila.cola.salaEmergencia;

import java.util.concurrent.atomic.AtomicInteger;

public class Patients implements Comparable<Patients>{
    private String nombre;
    private Gravity gravity;

    public Patients(String nombre, Gravity gravity) {
        this.nombre = nombre;
        this.gravity = gravity;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Gravity getGravity() {
        return gravity;
    }

    public void setGravity(Gravity gravity) {
        this.gravity = gravity;
    }

    @Override
    public int compareTo(Patients patients) {
        int curentLevel = this.gravity.getLevel();
        int compareLevel = patients.gravity.getLevel();
        return compareLevel - curentLevel;
    }
}
