package com.company;

public class Cliente {
    private Integer numeroCliente;
    private String nombre;
    private Double deuda;
    private static String banco;
    public static  String getBanco()
    {
        return banco;
    }
    public  static  void setBanco(String nombre)
    {
        banco=nombre;
    }

    public Cliente(Integer numeroCliente, String nombre)
    {
        this.numeroCliente=numeroCliente;
        this.nombre=nombre;
        deuda=0.0;
    }
    public Cliente()
    {
        deuda=0.0;
    }
    public void incrementarDeuda(Double valor)
    {
        if (valor >0)
            this.deuda+=valor;
        else
            System.out.println("El valor debe ser positivo");
    }
    public void pagarDeuda()
    {
        deuda=0.0;
    }
    public void pagarDeuda(Double valor)
    {
        if (valor <=deuda)
            deuda-=valor;
        else
            System.out.println("Es superior al saldo");
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public String getNombre()
    {
        return nombre;
    }
    public String toString()
    {
        return "Banco: " + banco + " Nombre: " + nombre +  " Nro Cliente: " + numeroCliente + " Deuda: " + deuda;
    }

}
