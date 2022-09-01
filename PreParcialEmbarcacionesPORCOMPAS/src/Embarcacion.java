public abstract class Embarcacion {
    private double precioBase;
    private double valorAdicional;
    private int anioFabricacion;
    private int slora;
    private Capitan capitan;

    public Embarcacion() {
    }

    public Embarcacion(double precioBase, double valorAdicional, int anioFabricacion, int slora, Capitan capitan) {
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.slora = slora;
        this.capitan = capitan;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public int getSlora() {
        return slora;
    }

    public void setSlora(int slora) {
        this.slora = slora;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }
    public double calcularMontoAlquier(){
        return anioFabricacion>2020? precioBase+valorAdicional:precioBase;
    }
}
