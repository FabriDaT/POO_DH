public class UnidadDeTrabajoFactory {
    private static UnidadDeTrabajoFactory instance = new UnidadDeTrabajoFactory();
    public static final String UTS = "Unidad de trabajo simple";
    public static final String UTC = "Unidad de trabajo combinada";

    private UnidadDeTrabajoFactory() {
    }

    public static UnidadDeTrabajoFactory getInstance() {
        return instance;
    }

    public UnidadDeTrabajo crearUnidadDeTrabajo(String type, String nombre) {

        switch (type) {
            case UTS: {
                return new UnidadDeTrabajoSimple(nombre);
            }
            case UTC: {
                return new UnidadDeTrabajoCombinada(nombre);
            }
            default:{
                return null;
            }
        }
    }

}
