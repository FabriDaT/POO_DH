package com.company;

public class Main {

    public static void main(String[] args) {

        Cliente.setBanco("Bru Bank");

        Cliente primerCliente=new Cliente(111, "Juan");
        Cliente segundoCliente= new Cliente();
        Cliente.setBanco("DH Bank");
        Cliente tercerCliente= new Cliente(112, "Mariana");

        System.out.println(primerCliente.toString());
        System.out.println(segundoCliente);
        System.out.println(tercerCliente);
        primerCliente.incrementarDeuda(10000.0);
        System.out.println(primerCliente.toString());
        System.out.println(segundoCliente);
        System.out.println(tercerCliente);
    }
}
