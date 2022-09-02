import java.time.LocalDate;

public class Campo extends Propiedad {
    private boolean casco;
    private double cantidadHectares;

    public Campo(LocalDate fechaDeAdquisicion, double precioUSD, String direccion, boolean hipotecada, Dueño dueño, boolean casco, double cantidadHectares) {
        super(fechaDeAdquisicion, precioUSD, direccion, hipotecada, dueño);
        this.casco = casco;
        this.cantidadHectares = cantidadHectares;
    }

    public Campo() {
        super();
    }

    public Campo(boolean casco, double cantidadHectares) {
        this.casco = casco;
        this.cantidadHectares = cantidadHectares;
    }

    public boolean aptoParaCultivo() {
        if (this.cantidadHectares > 10) {
            return true;
        } else
            return false;
    }

    @Override
    public String toString() {
        return "Campo{" +
                "casco=" + casco +
                ", cantidadHectares=" + cantidadHectares +
                '}';
    }
}


