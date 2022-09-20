package com.company;
/*
* Una variable estática (static) en Java es una variable que pertenece a la clase en que fue declarada y se inicializa
* solo una vez al inicio de la ejecución del programa, la característica principal de este tipo de variables es que se puede
*  acceder directamente
* con el nombre de la clase sin necesidad de crear un objeto*/
public class EmpleadoFactory {

    private static EmpleadoFactory instancia;
    // Esta va a ser la instancia entre el exterior y lo que haga esta clase "EmpleadoFactory"
    // es una variable estatica que representa UNA instacia de la clase EmpleadoFactory
    // que va a ser la unica instancia que va a funcionar, aplico SINGLETON, una unica instancia de una clase
    // en este caso es una variable interna de la clase.
    public static final String EMPLEADO_RELACION_DEPENDENCIA="ERD";  // final quiere decir que la variable sera una CONSTANTE, osea siempre con el mismo valor, siempre
    public static final String EMPLEADO_POR_HORA="EPH";

    private EmpleadoFactory()  // El constructor PRIVATE se utiliza cuando uso SINGLETON ya que no quiero que sea publico
            // porque estaria dejando que cualquiera pueda acceder y NO es el objetivo del  SINGLETON. SINGLETON
            // solo me permite crear una sola instancia de esta clase, y nadie mas puede acceder a ella para instanciarla
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
