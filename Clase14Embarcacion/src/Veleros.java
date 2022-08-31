public class Veleros extends Embarcacion{
    private int cantidadDeMastiles;

    public Veleros(Capitan capitan, double precioBase, double valorAdicional, int anioDeFabricacion, double longitud, int cantidadDeMastiles)
    {
        super(capitan, precioBase, valorAdicional, anioDeFabricacion, longitud);
        this.cantidadDeMastiles = cantidadDeMastiles;
    }

    public Veleros(int cantidadDeMastiles) {
        this.cantidadDeMastiles = cantidadDeMastiles;
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
        System.out.println("El velero NO es grande, tiene menos de 4 mastiles..");
    }


}
