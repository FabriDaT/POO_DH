public class UnidadSimple extends UnidadDeTrabajo {
    private double montoPorPersona;
    private int cantidadDePersonas;

    public UnidadSimple(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    public UnidadSimple(String nombre, String descripcion, double monto, int cantidadDePersonas) {
        super(nombre, descripcion);
        this.montoPorPersona = monto;
        this.cantidadDePersonas = cantidadDePersonas;
    }

    @Override
    public double calcularMonto() {
        if (this.cantidadDePersonas > 10){

            return (cantidadDePersonas * montoPorPersona) + (20 * (cantidadDePersonas * montoPorPersona) / 100);
    } else return  cantidadDePersonas*montoPorPersona;

    }

    @Override
    public void mostrar() {
        System.out.println("UNIDADE SIMPLE!!---  Nombre: " + getNombre() + "  Monto: " + calcularMonto());
    }

    public void setMontoPorPersona(double montoPorPersona) {
        this.montoPorPersona = montoPorPersona;
    }

    public void setCantidadDePersonas(int cantidadDePersonas) {
        this.cantidadDePersonas = cantidadDePersonas;
    }
}
