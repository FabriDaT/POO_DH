package com.company;

public class PacienteException extends Exception{

    public PacienteException() {
        super();
    }
    public PacienteException(String mensaje) {
        super(mensaje);
    }

    public String toString(){
        return "Se produjo un error: "+ this.getClass().getName() + "/n" +
                "Mensaje: " + this.getMessage() + "/n";
    }
}
