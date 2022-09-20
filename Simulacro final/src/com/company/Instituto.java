package com.company;

import java.util.ArrayList;

public class Instituto
{
    private ArrayList<OfertaAcademica> ofertas;
    private String nombre;

    public Instituto(String nombre) {
        this.nombre = nombre;
        ofertas= new ArrayList<>();
    }
    public void agregarOferta(OfertaAcademica oferta)
    {
        ofertas.add(oferta);
    }
    public String generarInforme()
    {   String datos="";
        for(OfertaAcademica oferta:ofertas)
            datos += oferta.mostrar()+"\n";
        return datos;
    }
}
