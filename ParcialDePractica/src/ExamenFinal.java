public class ExamenFinal extends Examen implements Comparable<ExamenFinal>{
    private double notaOral;
    private String descripcionDelTemaOral;

    public ExamenFinal(String titulo, String enunciado, double nota, Alumno alumno, double notaOral, String descripcionDelTemaOral) {
        super(titulo, enunciado, nota, alumno);
        this.notaOral = notaOral;
        this.descripcionDelTemaOral = descripcionDelTemaOral;
    }
    public ExamenFinal(){
        super();
    }

    public double getNotaOral() {
        return notaOral;
    }

    public String getDescripcionDelTemaOral() {
        return descripcionDelTemaOral;
    }

    @Override
    public void estaAprobado() {
        if (notaOral > 4 && getNota() > 4){
            System.out.println("Aprobo el final");
        } else
            System.out.println("No aprobo el final");
    }

    public double SacarPromedio(){
        return (this.notaOral + getNota()) / 2;
    }

    @Override
    public int compareTo(ExamenFinal o) {
       // return (this.SacarPromedio() - o.SacarPromedio()); Podria hacerse si promedio fuera de tipo INT y no double
        if (this.SacarPromedio() > o.SacarPromedio()) {
            return 1;
        } else if (this.SacarPromedio() < o.SacarPromedio()) {
            return -1;
        } else
            return 0;
    }
}
