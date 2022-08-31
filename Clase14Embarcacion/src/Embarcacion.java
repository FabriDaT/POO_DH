public abstract class Embarcacion {
    private double precioBase;
    private double valorAdicional;
    private int anioDeFabricacion;
    private double longitud;

    public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, int anioDeFabricacion, double longitud) {
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioDeFabricacion = anioDeFabricacion;
        this.longitud = longitud;
    }

    public Embarcacion() {
    }
     public double calcularAlquiler(double precioBase, int anioDeFabricacion, double valorAdicional){
        if (anioDeFabricacion > 2020)
            return precioBase+valorAdicional;
        return  precioBase;

     }


}
