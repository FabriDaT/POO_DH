package com.company;

public class Curso extends OfertaAcademica{

    private double precioHora;
    private int cargaHoraria;
    private int mesesDuracion;

    public Curso(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    @Override
    public double calcularPrecio() {
        return precioHora*cargaHoraria*mesesDuracion;
    }

    @Override
    public String mostrar() {
        return "Nombre: " + getNombre() + " Precio: " + calcularPrecio();
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setMesesDuracion(int mesesDuracion) {
        this.mesesDuracion = mesesDuracion;
    }
}
