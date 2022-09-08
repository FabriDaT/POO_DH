package com.company;

public class Main {

    public static void main(String[] args) {
        Cliente cliente= new Cliente("Juan", "Perez", "3333333", 1000);

        try {
            cliente.saldarDeuda(1000);
        }
        catch (ClienteException e)
        {
            System.err.println(e.toString());
        }
        try {
            cliente.comprar(5000);
        }
        catch (ClienteException e)
        {
            System.err.println(e.toString());
            System.out.println(e.toString());
        }

    }
}
