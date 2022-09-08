package com.company;

public class Jugador implements  Comparable<Jugador>{
    private int numeroCamiseta;
    private String nombre;
    private boolean titular;
    private boolean lesionado;

    public Jugador(int numeroCamiseta, String nombre, boolean titular) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.titular = titular;
        lesionado=false;
    }

    @Override
    public int compareTo(Jugador jugador) {
        return this.numeroCamiseta- jugador.numeroCamiseta;
    }

    public boolean esTitular()
    {
        return titular;
    }
    public boolean estaLesionado()
    {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "numeroCamiseta=" + numeroCamiseta +
                ", nombre='" + nombre + '\'' +
                ", " + (titular?" Titular ":" No es titular ") +
                '}';
    }

}
