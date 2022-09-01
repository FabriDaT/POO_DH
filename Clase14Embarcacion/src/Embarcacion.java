public abstract class Embarcacion {
    private double precioBase;
    private double valorAdicional;
    private int anioDeFabricacion;
    private double longitud;
    private Capitan capitan;

    public Embarcacion(double precioBase, double valorAdicional, int anioDeFabricacion, double longitud, Capitan capitan) {
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioDeFabricacion = anioDeFabricacion;
        this.longitud = longitud;
        this.capitan = capitan;
    }

    public Embarcacion() {
    }
     public double calcularAlquiler(double precioBase, int anioDeFabricacion, double valorAdicional){
        if (anioDeFabricacion > 2020)
            return precioBase+valorAdicional;
        return  precioBase;

     }

    @Override
    public String toString() {
        return "Embarcacion{" +
                "precioBase=" + precioBase +
                ", valorAdicional=" + valorAdicional +
                ", anioDeFabricacion=" + anioDeFabricacion +
                ", longitud=" + longitud +
                ", capitan=" + capitan +
                '}';
    }
}
