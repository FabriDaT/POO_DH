public class UnidadDeTrabajoSimple extends UnidadDeTrabajo{
    private Integer cantidadDePersonas;
    private Double montoPorPersona;

    public UnidadDeTrabajoSimple(String nombre, String descripcion, Integer cantidadDePersonas, Double montoPorPersona) {
        super(nombre, descripcion);
        this.cantidadDePersonas = cantidadDePersonas;
        this.montoPorPersona = montoPorPersona;
    }

    public UnidadDeTrabajoSimple() {
    }

    public UnidadDeTrabajoSimple(String nombre) {
        super(nombre);
    }

    public void setCantidadDePersonas(Integer cantidadDePersonas) {
        this.cantidadDePersonas = cantidadDePersonas;
    }

    public void setMontoPorPersona(Double montoPorPersona) {
        this.montoPorPersona = montoPorPersona;
    }

    @Override
    public Double calcularMonto() {
        Double montoTotal = cantidadDePersonas * montoPorPersona;
        if (cantidadDePersonas > 10){
            montoTotal *= 1.2;
        }
        return montoTotal;
    }

    @Override
    public void mostrar() {
        System.out.println(
                "Nombre: " + super.getNombre() + "\n" +
                "Monto Total: " + calcularMonto() + "\n"
        );
    }
}
