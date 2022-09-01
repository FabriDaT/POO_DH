public class ExamenParcial extends Examen{
    private int numeroDeUnidad;
    private int cantidadReintentos;

    public ExamenParcial(String titulo, String enunciado, double nota, Alumno alumno, int numeroDeUnidad) {
        super(titulo, enunciado, nota, alumno);
        this.numeroDeUnidad = numeroDeUnidad;
        this.cantidadReintentos = 0;
    }
    public ExamenParcial() {
        super();
    }

    @Override
    public void estaAprobado() {
        if (getNota() >= 4){
            System.out.println("Esta aprobado");
        } else System.out.println("NO esta aprobado");
    }


    @Override
    public String toString() {
        return "ExamenParcial{" +
                "Alumno" + alumno.toString() +
                "numeroDeUnidad=" + numeroDeUnidad +
                ", cantidadReintentos=" + cantidadReintentos +
                '}';
    }
    public void vaArecuperar(){
        cantidadReintentos++;
    }

    public  String esPosibleRecuperar(int numeroDeUnidad){
        if ((numeroDeUnidad <= 3) && (cantidadReintentos < 3)){

            return "SI puede recuperar";

        } else if ((numeroDeUnidad > 3 )&& (cantidadReintentos < 2)) {
            return "No puede volver a recuperar el parcial";
        } else return "jaja";

    }

    public int getCantidadReintentos() {
        return cantidadReintentos;
    }
}
