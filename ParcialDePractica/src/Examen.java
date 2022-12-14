public abstract class Examen {
    private String titulo;
    private String enunciado;
    private double nota;
    protected Alumno alumno;

    public abstract void estaAprobado();

    public Examen(String titulo, String enunciado, double nota, Alumno alumno) {
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
        this.alumno = alumno;
    }

    public Examen() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "Examen{" +
                "titulo='" + titulo + '\'' +
                ", nota=" + nota +
                ", alumno=" + alumno.toString() +
                '}';
    }
}
