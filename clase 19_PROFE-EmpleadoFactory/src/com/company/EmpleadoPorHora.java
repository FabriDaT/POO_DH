package com.company;

public class EmpleadoPorHora extends Empleado{

    private Double importePorHora;
    private Integer horasTrabajadas;

    public EmpleadoPorHora() {

    }
    public EmpleadoPorHora(String nombre, String apellido, Integer legajo)
    {
        super(nombre, apellido, legajo);
    }
    public EmpleadoPorHora(String nombre, String apellido, Integer legajo, Double importePorHora) {
        super(nombre, apellido, legajo);
        this.importePorHora = importePorHora;
        horasTrabajadas = 0;
    }


    @Override
    public Double calcularSueldo() {
        return importePorHora * horasTrabajadas;
    }

    public void cargarHoras(Integer horasIngresadas){
        horasTrabajadas += horasIngresadas;
    }
}
