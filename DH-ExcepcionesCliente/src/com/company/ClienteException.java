package com.company;

public class ClienteException extends  Exception{
    public ClienteException() {
        super();
    }

    public ClienteException(String s) {
        super(s);
    }

    public String toString()
    {
        return "Nombre: " + this.getClass().getName() + "Mensaje: " + getMessage();
    }
}
