import java.util.ArrayList;

public class Contenedor implements Comparable<Contenedor>{
    private int identificacion;
    private String paisProcedencia;
    private boolean materialesPeligrosos;

    public Contenedor(int identificacion, String paisProcedencia, boolean materialesPeligrosos) {
        this.identificacion = identificacion;
        this.paisProcedencia = paisProcedencia;
        this.materialesPeligrosos = materialesPeligrosos;
    }
    public boolean tieneMaterialesPeligrosos(){
        return materialesPeligrosos;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    @Override
    public int compareTo(Contenedor o) {
        return this.identificacion - o.identificacion;
    }  // Que y para que esta esta funcion ? Sirve para criterio de ordenar con el SORT ???
    // parece ser que para ordenar por UN SOLO criterio (llamado "orden natural") necesito sobreescribir el comparteTo para
    // darle un criterio al metodo Sort para ordenar el array. Al parecer funciona de esta manera, siempre igual... !!

    @Override
    public String toString() {
        return "Contenedor{" +
                "identificacion=" + identificacion +
                ", paisProcedencia='" + paisProcedencia + '\'' +
                '}';
    }
}
