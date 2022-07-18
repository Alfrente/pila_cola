package com.arroyo.pila.cola.salaEmergencia;

public enum Gravity {

    MINOR("Minor", 1),
    MODERATE("Moderate", 2),
    SERVERE("Severe", 3),
    VERY_SERVERE("Very Severe", 4);

    private String descripcion;
    private Integer level;

    Gravity(String descripcion, Integer level) {
        this.descripcion = descripcion;
        this.level = level;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
