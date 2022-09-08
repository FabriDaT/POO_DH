package com.company;

import java.util.Date;

import com.company.PacienteException;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;


    Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion) throws PacienteException {
        Date hoy = new Date();
        this.nombre = nombre;
        this.apellido = apellido;
        fechaAlta = null;
        if (fechaInternacion.before(hoy)) {
            this.fechaInternacion = fechaInternacion;
            System.out.println(fechaInternacion);
        } else {
            throw new PacienteException("Error! La fecha de internacion no puede ser mayor a hoy");
        }
    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta) throws PacienteException {
        if (fechaAlta.after(fechaInternacion))
            System.out.println("Ok");
        else{
            throw new PacienteException("No podes darte de alta antes de la fecha de ingreso");
        }
    }
}

