public abstract class UnidadDeTrabajo {
    private String nombre;
    private String descripcion;

    public UnidadDeTrabajo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public UnidadDeTrabajo() {
    }

    public UnidadDeTrabajo(String nombre) {
        this.nombre = nombre;
    }

    public abstract Double calcularMonto();
    public abstract void mostrar();

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "UnidadDeTrabajo{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }


}
