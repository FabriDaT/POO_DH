public class Yates extends Embarcacion implements Comparable {
    private int cantidadDeCamarotes;

    public Yates(Capitan capitan, double precioBase, double valorAdicional, int anioDeFabricacion, double longitud, int cantidadDeCamarotes) {
        super(capitan, precioBase, valorAdicional, anioDeFabricacion, longitud);
        this.cantidadDeCamarotes = cantidadDeCamarotes;
    }

    public Yates(int cantidadDeCamarotes) {
        this.cantidadDeCamarotes = cantidadDeCamarotes;
    }

    public int getCantidadDeCamarotes() {
        return cantidadDeCamarotes;
    }

    public void setCantidadDeCamarotes(int cantidadDeCamarotes) {
        this.cantidadDeCamarotes = cantidadDeCamarotes;
    }


    @Override
    public int compareTo(Yates yate) {
        if (this.cantidadDeCamarotes == yate.getCantidadDeCamarotes()) return 0;
        
    }
}
