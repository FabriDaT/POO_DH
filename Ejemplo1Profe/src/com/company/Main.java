package com.company;


import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static String obtenerIniciales(String n, String a)
    {
        return n.charAt(0) + "" + a.charAt(0);
    }
    public static void main(String[] args) {

        LocalDate otraFecha=LocalDate.now();
        LocalDate otraFecha2=LocalDate.parse("2020-02-15");

        otraFecha.toString();
        
        Scanner scanner = new Scanner(System.in);
        String nombre, iniciales, fecha;
        int dia,mes, anio;

        System.out.println("Ingrese día");
        dia = scanner.nextInt();
        System.out.println("Ingrese mes");
        mes = scanner.nextInt();
        System.out.println("Ingrese año");
        anio = scanner.nextInt();
        fecha=armarFecha(dia,mes,anio);

        scanner.nextLine();
        System.out.println("Ingrese nombre");
        nombre=scanner.nextLine();
        System.out.println("Ingrese apellido");
        String apellido=scanner.nextLine();
        iniciales=obtenerIniciales(nombre,apellido);
        mostrarResultados(iniciales, fecha);
    }
    public static void mostrarResultados(String iniciales, String fecha)
    {
        System.out.println(iniciales);
        System.out.println( fecha);
    }
    public static String armarFecha(int d, int m, int a)
    {
        return d +"/" +m +"/" +a;
    }

}
