public class Yates extends Embarcacion implements Comparable<Yates> {
    private int cantidadDeCamarotes;

    public Yates(double precioBase, double valorAdicional, int anioDeFabricacion, double longitud, Capitan capitan, int cantidadDeCamarotes) {
        super(precioBase, valorAdicional, anioDeFabricacion, longitud, capitan);
        this.cantidadDeCamarotes = cantidadDeCamarotes;
    }

    public Yates() {
        super();
    }

    public int getCantidadDeCamarotes() {
        return cantidadDeCamarotes;
    }

    public void setCantidadDeCamarotes(int cantidadDeCamarotes) {
        this.cantidadDeCamarotes = cantidadDeCamarotes;
    }


    @Override
    public int compareTo(Yates y) {
        if (this.cantidadDeCamarotes == y.getCantidadDeCamarotes()){
            return 0;
        } else if (this.cantidadDeCamarotes > y.getCantidadDeCamarotes()) {
            return 1;
        }
        else  return -1;
        
    }
}
