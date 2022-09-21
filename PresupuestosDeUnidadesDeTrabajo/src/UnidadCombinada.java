import java.util.ArrayList;

public class UnidadCombinada extends UnidadDeTrabajo{
    private double coeficienteGlobal;
    private double montoMateriales;
    private ArrayList<UnidadDeTrabajo> unidades;


    public UnidadCombinada(String nombre, String descripcion, double coeficienteGlobal, double montoMateriales) {
        super(nombre, descripcion);
        this.coeficienteGlobal = coeficienteGlobal;
        this.montoMateriales = montoMateriales;
        this.unidades = new ArrayList<>();
    }

    public UnidadCombinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        this.unidades = new ArrayList<>();
    }

    public void setCoeficienteGlobal(double coeficienteGlobal) {
        this.coeficienteGlobal = coeficienteGlobal;
    }

    @Override
    public double calcularMonto() {
        double total=0.0;
        for (UnidadDeTrabajo uni: unidades){
            total =+ uni.calcularMonto();
        }
        return total+montoMateriales;
    }

    @Override
    public void mostrar() {
        System.out.println(" UNIDADES COMBINADAS CHANGO ");
        for (UnidadDeTrabajo uni: unidades){
            uni.mostrar();
        }
        
    }

    public void setMontoMateriales(double montoMateriales) {
        this.montoMateriales = montoMateriales;
    }
    public void addUnidadesTrabajo(UnidadDeTrabajo uni){
        unidades.add(uni);
    }
}
