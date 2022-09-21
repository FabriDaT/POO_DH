public abstract class UnidadDeTrabajo {
    private String nombre;
    private String descripcion;

    public UnidadDeTrabajo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public abstract double calcularMonto();
    public abstract String mostrar();

    public String getNombre() {
        return nombre;
    }
}
