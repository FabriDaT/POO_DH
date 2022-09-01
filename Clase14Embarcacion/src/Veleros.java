public class Veleros extends Embarcacion{
    private int cantidadDeMastiles;

    public Veleros(double precioBase, double valorAdicional, int anioDeFabricacion, double longitud, Capitan capitan, int cantidadDeMastiles) {
        super(precioBase, valorAdicional, anioDeFabricacion, longitud, capitan);
        this.cantidadDeMastiles = cantidadDeMastiles;
    }

    public Veleros() {
        super();
    }

    public int getCantidadDeMastiles() {
        return cantidadDeMastiles;
    }

    public void setCantidadDeMastiles(int cantidadDeMastiles) {
        this.cantidadDeMastiles = cantidadDeMastiles;
    }

    public void evaluarSiEsGrande(){
        if(this.cantidadDeMastiles > 4)
            System.out.println("El velero ES GRANDE, tiene mas de 4 mastiles..");
        else
            System.out.println("El velero NO es grande, tiene menos de 4 mastiles..");
    }


}
