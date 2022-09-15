package com.company;

public abstract class Empleado {

    private String nombre;
    private String apellido;
    private Integer legajo;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, Integer legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    public abstract Double calcularSueldo();


}
