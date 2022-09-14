package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;
    private int cantidadTitulares;

    public Equipo(String nombre, int cantidadTitulares) {
        this.nombre = nombre;
        jugadores=new ArrayList<>();
        this.cantidadTitulares=cantidadTitulares;
    }
    public void addJugador(Jugador jugador)
    {
        jugadores.add(jugador);
    }
    public void mostrarJugadoresTitulares()
    {
        for (Jugador j:jugadores)
        {
            if (j.esTitular())
                System.out.println(j.toString());
        }
    }
    public void jugadorLesionado(int pos)
    {
        jugadores.get(pos).setLesionado(true);
    }
    public void reemplazo()
    {   int pos=0;

        while( jugadores.size()<pos && this.getCantidadJugadoresTitulares()<cantidadTitulares)
        {
            if (!jugadores.get(pos).esTitular())
                jugadores.get(pos).setTitular(true);
            pos++;

        }
    }
    public int getCantidadJugadoresLesionados()
    {   int cantidad=0;
        for (Jugador j:jugadores)
        {
            if (j.estaLesionado())
                cantidad++;
        }
        return cantidad;
    }
    public int getCantidadJugadoresTitulares()
    {   int cantidad=0;
        for (Jugador j:jugadores)
        {
            if (j.esTitular())
                cantidad++;
        }
        return cantidad;
    }
    public void ordenar()
    {
        Collections.sort(jugadores);
    }

}
