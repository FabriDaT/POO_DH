import java.util.ArrayList;

public class UnidadDeTrabajoCombinada extends UnidadDeTrabajo {
    private Double coeficienteGlobal;
    private Double montoDeMaterial;
    private ArrayList<UnidadDeTrabajo> unidadesDeTrabajo;

    public UnidadDeTrabajoCombinada(String nombre, String descripcion, Double coeficienteGlobal, Double montoDeMaterial) {
        super(nombre, descripcion);
        this.coeficienteGlobal = coeficienteGlobal;
        this.montoDeMaterial = montoDeMaterial;
        this.unidadesDeTrabajo = new ArrayList<UnidadDeTrabajo>();
    }

    public UnidadDeTrabajoCombinada() {
        super();
        this.unidadesDeTrabajo = new ArrayList<UnidadDeTrabajo>();
    }

    public UnidadDeTrabajoCombinada(String nombre) {
        super(nombre);
        this.unidadesDeTrabajo = new ArrayList<UnidadDeTrabajo>();
    }

    public void setCoeficienteGlobal(Double coeficienteGlobal) {
        this.coeficienteGlobal = coeficienteGlobal;
    }

    public void addUnidadDeTrabajo(UnidadDeTrabajo unidadDeTrabajo) {
        unidadesDeTrabajo.add(unidadDeTrabajo);
    }

    @Override
    public Double calcularMonto() {
        Double montoTotal = 0.0;
        for(UnidadDeTrabajo udt : unidadesDeTrabajo) {
            montoTotal += udt.calcularMonto();
        }
        return montoTotal * coeficienteGlobal;
    }

    @Override
    public void mostrar() {
        for(UnidadDeTrabajo udt : unidadesDeTrabajo) {
           udt.mostrar();
        }
    }
}
