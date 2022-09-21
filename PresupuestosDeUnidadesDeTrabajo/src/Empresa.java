import java.util.ArrayList;

public class Empresa {
    private String nombre;

    private ArrayList<UnidadDeTrabajo> unidadesDeTrabajo;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.unidadesDeTrabajo = new ArrayList<>();
    }

    public void agregarUnidad(UnidadDeTrabajo unidad){
        unidadesDeTrabajo.add(unidad);
    }
}
