package com.company;

public class EmpleadoRelacionDependencia extends Empleado{

    private Double sueldoMensual;


    public EmpleadoRelacionDependencia(String nombre, String apellido, Integer legajo,Double sueldoMensual) {
        super(nombre, apellido, legajo);
        this.sueldoMensual = sueldoMensual;

    }

    public EmpleadoRelacionDependencia(String nombre, String apellido, Integer legajo)
    {
        super(nombre, apellido, legajo);
    }
    public EmpleadoRelacionDependencia() {

    }

    @Override
    public Double calcularSueldo() {
        return sueldoMensual;
    }
}
