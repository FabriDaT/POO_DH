public class Velero extends Embarcacion{
    private int cantidadMastil;

    public Velero() {
    }

    public Velero(double precioBase, double valorAdicional, int anioFabricacion, int slora, Capitan capitan, int cantidadMastil) {
        super(precioBase, valorAdicional, anioFabricacion, slora, capitan);
        this.cantidadMastil = cantidadMastil;
    }

    public int getCantidadMastil() {
        return cantidadMastil;
    }

    public void setCantidadMastil(int cantidadMastil) {
        this.cantidadMastil = cantidadMastil;
    }

    public String evaluarVelero(){
        return cantidadMastil>4? "El velero es grande":"El velero es chico";
    }

    @Override
    public String toString() {
        return "Velero{" +"\n"+
                "cantidadMastil=" + cantidadMastil + "\n"+
                "El capitan es=" + getCapitan().getNombre() + "\n"+
                '}';
    }
}
