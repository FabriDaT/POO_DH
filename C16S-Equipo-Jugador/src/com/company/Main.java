package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Jugador jugador1=new Jugador(10,"Lio", true);
        Jugador jugador2=new Jugador(7,"Cristiano", true);
        Jugador jugador3=new Jugador(99,"Lucas Diaz", false);
        Equipo equipo=new Equipo("DH",2);
        equipo.addJugador(jugador1);
        equipo.addJugador(jugador2);
        equipo.addJugador(jugador3);

        equipo.mostrarJugadoresTitulares();
        equipo.jugadorLesionado(1);
        equipo.reemplazo();
        System.out.println("Cantidad de jugadores lesionados "+equipo.getCantidadJugadoresLesionados());

    }
}
