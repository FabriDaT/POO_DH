public class Yate extends Embarcacion implements Comparable<Yate>{
    private int cantidadCamarotes;
    private String nombre;

    public Yate() {
    }

    public Yate(double precioBase, double valorAdicional, int anioFabricacion, int slora, Capitan capitan, int cantidadCamarotes,String nombre) {
        super(precioBase, valorAdicional, anioFabricacion, slora, capitan);
        this.cantidadCamarotes = cantidadCamarotes;
        this.nombre=nombre;
    }

    public int getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    public void setCantidadCamarotes(int cantidadCamarotes) {
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Yate o) {
        return this.cantidadCamarotes-o.cantidadCamarotes;
    }

    @Override
    public String toString() {
        return "Yate{" +
                "cantidadCamarotes=" + cantidadCamarotes +
                '}';
    }
}
