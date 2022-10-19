public class UnidadTrabajoFACTORY {
    private static UnidadTrabajoFACTORY instancia;
    //constastes
    public static final String MANTENIMIENTO="mantenimiento";
    public static final String LIMPIEZA="limpieza";
    public static final String SERVICIOS_GENERALES= "servicios generales";
    public static UnidadTrabajoFACTORY getInstancia() {
        if(instancia==null)
            instancia = new UnidadTrabajoFACTORY();
        return instancia;
    }
    public UnidadDeTrabajo crearUnidadTrabajo(String tipo, String nombre, String descrpcion){
        switch (tipo){
            case("mantenimiento"):
            case ("limpieza"):
                return new UnidadSimple(nombre,descrpcion);
            case ("servicios generales"):
                return new UnidadCombinada(nombre,descrpcion);

        }
        throw new RuntimeException("UPS!.. No ingresaste un tipo valido de unidad");
    }
}
