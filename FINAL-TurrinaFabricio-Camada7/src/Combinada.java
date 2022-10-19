import java.util.ArrayList;

public class Combinada extends Habilidades {
    private int factorMultiplicador;
    private ArrayList<Habilidades> habilidades;


    public Combinada(String nombre, String descripcion, int factorMultiplicador) {
        super(nombre, descripcion);
        this.factorMultiplicador = factorMultiplicador;
        this.habilidades = new ArrayList<>();
    }

    public void setFactorMultiplicador(int factorMultiplicador) {
        this.factorMultiplicador = factorMultiplicador;
    }
    public void agregarHabilidades(Habilidades habilid){
        habilidades.add(habilid);
    }

    @Override
    public double calcularPuntaje() {
        double sumatoria=0;
        for (Habilidades h:habilidades) {
            sumatoria += h.calcularPuntaje();
        }
        return sumatoria*factorMultiplicador;
    }
}
