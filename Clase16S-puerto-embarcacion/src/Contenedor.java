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

    @Override
    public int compareTo(Contenedor o) {
        return this.identificacion - o.identificacion;
    }


}
