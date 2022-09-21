public class Test {
    public static void main(String[] args) {
        UnidadDeTrabajoFactory utFactory = UnidadDeTrabajoFactory.getInstance();
        UnidadDeTrabajoSimple primerUnidad = (UnidadDeTrabajoSimple)utFactory.crearUnidadDeTrabajo(UnidadDeTrabajoFactory.UTS, "Mantenimiento");
        primerUnidad.setCantidadDePersonas(4);
        primerUnidad.setMontoPorPersona(120000.0);
        UnidadDeTrabajoSimple segundaUnidad = (UnidadDeTrabajoSimple)utFactory.crearUnidadDeTrabajo(UnidadDeTrabajoFactory.UTS, "Limpieza");
        segundaUnidad.setCantidadDePersonas(24);
        segundaUnidad.setMontoPorPersona(100000.0);
        UnidadDeTrabajoCombinada tercerUnidad = (UnidadDeTrabajoCombinada)utFactory.crearUnidadDeTrabajo(UnidadDeTrabajoFactory.UTC, "Servicios Generales");
        tercerUnidad.setCoeficienteGlobal(3.0);
        tercerUnidad.addUnidadDeTrabajo(primerUnidad);
        tercerUnidad.addUnidadDeTrabajo(segundaUnidad);
        UnidadDeTrabajoCombinada cuartaUnidad = (UnidadDeTrabajoCombinada)utFactory.crearUnidadDeTrabajo(UnidadDeTrabajoFactory.UTC, "Servicios Generales");
        cuartaUnidad.setCoeficienteGlobal(3.0);
        cuartaUnidad.addUnidadDeTrabajo(primerUnidad);
        cuartaUnidad.addUnidadDeTrabajo(segundaUnidad);
        cuartaUnidad.addUnidadDeTrabajo(tercerUnidad);

        cuartaUnidad.mostrar();
    }

}