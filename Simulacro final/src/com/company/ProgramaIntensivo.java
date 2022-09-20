package com.company;

import java.util.ArrayList;

public class ProgramaIntensivo extends  OfertaAcademica{
    private double descuento;
    private ArrayList<OfertaAcademica> cursos;

    public ProgramaIntensivo(String nombre, String descripcion) {
        super(nombre, descripcion);
        cursos=new ArrayList<>();
    }

    public void agregarCurso(OfertaAcademica oferta)
    {
        cursos.add(oferta);
    }
    public double calcularDescuento(double total)
    {
        return total /100*descuento;
    }
    @Override
    public double calcularPrecio() {
        double total=0;
        for(OfertaAcademica oferta:cursos)
            total+=oferta.calcularPrecio();
        return total-calcularDescuento(total);
    }

    @Override
    public String mostrar() {
       return "Nombre: " + getNombre() +  " Precio " + calcularPrecio();
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
