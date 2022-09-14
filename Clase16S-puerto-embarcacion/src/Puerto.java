import java.util.ArrayList;

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
    public int calcularCantidadContenedoresPeligrosos(ArrayList<Contenedor> contenedores){
        int contador=0;

        for (int i = 0; i < contenedores.size(); i++) {
            if (contenedores[i].)
        }
        return contador;
    }
    public void ordenar(){

       return contenedores.sort;
}




}
