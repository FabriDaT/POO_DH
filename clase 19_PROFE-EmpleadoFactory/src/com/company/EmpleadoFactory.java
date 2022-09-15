package com.company;

public class EmpleadoFactory {

    private static EmpleadoFactory instancia;
    // Esta va a ser la instancia entre el exterior y lo que haga esta clase "EmpleadoFactory"
    // es una variable estatica que representa UNA instacia de la clase EmpleadoFactory
    // que va a ser la unica instancia que va a funcionar, aplico SINGLETON, una unica instancia de una clase
    // en este caso es una variable interna de la clase.
    public static final String EMPLEADO_RELACION_DEPENDENCIA="ERD";
    public static final String EMPLEADO_POR_HORA="EPH";

    private EmpleadoFactory()  // El constructor PRIVATE se utiliza cuando uso SINGLETON
    {
    }
    public static EmpleadoFactory getInstancia()
    {
        if(instancia==null)
            instancia=new EmpleadoFactory();
        return instancia;
    }
    public Empleado crearEmpleado(String codigo,String nombre, String apellido, Integer legajo)
    {
        switch (codigo)
        {
            case "ERD":
                return new EmpleadoRelacionDependencia(nombre, apellido, legajo);
            case "EPH":
                return new EmpleadoPorHora(nombre, apellido, legajo);
        }
        return null;
    }

}
