package com.company;

public class Main {

    public static void main(String[] args) {
	Empresa empresa=new Empresa("DH");
	EmpleadoFactory empleadoFactory= EmpleadoFactory.getInstancia(); // crea el objeto pero lo deja INTERNO para que yo
		// le pida cosas

	empresa.agregarEmpleado(empleadoFactory.crearEmpleado(EmpleadoFactory.EMPLEADO_POR_HORA, "Juan", "Perez", 111));
	empresa.agregarEmpleado(empleadoFactory.crearEmpleado(EmpleadoFactory.EMPLEADO_RELACION_DEPENDENCIA, "Maria", "Gomez", 222));
	Empleado empleado=empleadoFactory.crearEmpleado("ERD","Juan", "Perez", 111);
	Empleado e= new EmpleadoPorHora();

    }
}
