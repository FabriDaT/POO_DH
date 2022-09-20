package com.company;

public abstract class OfertaAcademica {

    private String nombre;
    private String descripcion;

    public OfertaAcademica(String nombre, String descripcion)
    {
        this.nombre=nombre;
        this.descripcion=descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public abstract double calcularPrecio();
    public abstract String mostrar();
}
