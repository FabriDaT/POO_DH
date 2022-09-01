public class Capitan {
    private String nombre;
    private String apellido;
    private String matriculaDeNavegacion;

    public Capitan() {
    }

    public Capitan(String nombre, String apellido, String matriculaDeNavegacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaDeNavegacion = matriculaDeNavegacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMatriculaDeNavegacion() {
        return matriculaDeNavegacion;
    }

    public void setMatriculaDeNavegacion(String matriculaDeNavegacion) {
        this.matriculaDeNavegacion = matriculaDeNavegacion;
    }

    @Override
    public String toString() {
        return "Capitan{" +"\n"+
                "nombre='" + nombre + '\n' +
                ", apellido='" + apellido + '\n' +
                ", matriculaDeNavegacion='" + matriculaDeNavegacion + '\n' +
                '}';
    }
}
