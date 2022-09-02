import java.time.LocalDate;

public abstract class Propiedad {
    private LocalDate fechaDeAdquisicion;
    private double precioUSD;
    private String direccion;
    private boolean hipotecada;
    private Dueño dueño;

    public Propiedad(LocalDate fechaDeAdquisicion, double precioUSD, String direccion, boolean hipotecada, Dueño dueño) {
        this.fechaDeAdquisicion = fechaDeAdquisicion;
        this.precioUSD = precioUSD;
        this.direccion = direccion;
        this.hipotecada = hipotecada;
        this.dueño = dueño;
    }

    public Propiedad() {
    }

    public boolean aptaParaVenta(){
        return !this.hipotecada;
    }

    public LocalDate getFechaDeAdquisicion() {
        return fechaDeAdquisicion;
    }

    public double getPrecioUSD() {
        return precioUSD;
    }

    public String getDireccion() {
        return direccion;
    }

    public boolean isHipotecada() {
        return hipotecada;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setPrecioUSD(double precioUSD) {
        this.precioUSD = precioUSD;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        return "Propiedad{" +
                "precioUSD=" + precioUSD +
                ", direccion='" + direccion + '\'' +
                ", dueño=" + dueño +
                '}';
    }
}
