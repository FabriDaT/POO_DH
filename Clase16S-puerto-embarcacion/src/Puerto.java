import java.util.ArrayList;
import java.util.Collections;

public class Puerto {
    private String nombre;
    private ArrayList <Contenedor> contenedores;

    public Puerto(String nombre) {
        this.nombre = nombre;
        this.contenedores = new ArrayList<>();  // no tendria que ir el tipo "Contenedor" entre los <> ??
    }
    public void ingresarContenedor(Contenedor cont){
        this.contenedores.add(cont);
    }
    public int calcularCantidadContenedoresPeligrosos(){
        int contador=0;

        for(Contenedor c:contenedores) {
            if ((c.tieneMaterialesPeligrosos()) && (c.getPaisProcedencia().equals("Desconocido"))){
                contador++;
            }
        }
        return contador;
    }
    public void ordenar(){
        Collections.sort(contenedores);  // SORT  ordena en orden ascendente
}

    @Override
    public String toString() {
        return "Puerto{" +
                "nombre='" + nombre + '\'' +
                ", contenedores=" + contenedores.toString() +
                '}';
    }
}
