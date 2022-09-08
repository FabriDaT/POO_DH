package com.company;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws PacienteException {
        boolean tengoQueRepetir=true;

        while (tengoQueRepetir) {
            try {
                Scanner sc = new Scanner(System.in);
                int anio;
                int mes;
                int dia;
                System.out.println("Ingresa el año: ");
                anio = sc.nextInt();
                System.out.println("Ingresa el mes: ");
                mes = sc.nextInt();
                System.out.println("Ingresa el dia: ");
                dia = sc.nextInt();
                Paciente paciente = new Paciente("Juan", "Perez", "12345", new Date(anio, mes, dia));
                tengoQueRepetir=false;

            } catch (PacienteException exception) {
                System.out.println(exception.toString());

            }

        }
        System.out.println("Ta luego bebe");
    }
}

