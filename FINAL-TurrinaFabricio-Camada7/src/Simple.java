public class Simple extends Habilidades {
    private double puntaje;

    public Simple(String nombre, String descripcion, int puntaje) {
        super(nombre, descripcion);
        this.puntaje = puntaje;
    }

    public Simple(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public double calcularPuntaje() {
        if (getNombre() == "Disparar")
            return puntaje * 1.1;
        return puntaje;
    }
}
