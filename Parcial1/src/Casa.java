import java.time.LocalDate;

public class Casa extends Propiedad implements Comparable<Casa>{
    private int cantidadDeAmbientes;
    private double cantidadDeMetrosCuadrados;


    public Casa(LocalDate fechaDeAdquisicion, double precioUSD, String direccion, boolean hipotecada, Dueño dueño, int cantidadDeAmbientes, double cantidadDeMetrosCuadrados) {
        super(fechaDeAdquisicion, precioUSD, direccion, hipotecada, dueño);
        this.cantidadDeAmbientes = cantidadDeAmbientes;
        this.cantidadDeMetrosCuadrados = cantidadDeMetrosCuadrados;
    }

    public Casa(int cantidadDeAmbientes, double cantidadDeMetrosCuadrados) {
        this.cantidadDeAmbientes = cantidadDeAmbientes;
        this.cantidadDeMetrosCuadrados = cantidadDeMetrosCuadrados;
    }

    public Casa(){
        super();
    }

    public int getCantidadDeAmbientes() {
        return cantidadDeAmbientes;
    }

    public double getCantidadDeMetrosCuadrados() {
        return cantidadDeMetrosCuadrados;
    }

    @Override
    public int compareTo(Casa c) {
        return this.cantidadDeAmbientes-c.cantidadDeAmbientes;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "cantidadDeAmbientes=" + cantidadDeAmbientes +
                ", cantidadDeMetrosCuadrados=" + cantidadDeMetrosCuadrados +
                '}';
    }
}
