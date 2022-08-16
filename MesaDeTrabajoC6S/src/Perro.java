public class Perro {
    /*
    Para una institución que adopta perros se requiere tener de ellos: si están en adopción o
no, raza, año aproximado de nacimiento, peso, si tiene o no chip, si está o no lastimado y el
nombre de pila que le asignaron en la institución.
Deberemos poder preguntar la edad de un perro y si es un perro factible de perderse
—entendiendo que los perros que tienen chip son los que no se pueden perder—. Por otro
lado, se puede enviar a adopción a un perro si no está lastimado y su peso es mayor a 5 kg.
     */
    private String nombre;
    private Double  peso;
    private String raza;
    private int anoDeNacimiento;
    private Boolean estaEnAdopcion;
    private  Boolean tieneChip;
    private Boolean estaLastimado;

    public Perro(String nombre, Double peso, String raza, int anoDeNacimiento, Boolean estaLastimado) {
        this.nombre = nombre;
        this.peso = peso;
        this.raza = raza;
        this.anoDeNacimiento = anoDeNacimiento;
        this.estaEnAdopcion = false;
        this.tieneChip = false;
        this.estaLastimado = estaLastimado;
    }

    public Perro() {
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", raza='" + raza + '\'' +
                ", anoDeNacimiento='" + anoDeNacimiento + '\'' +
                ", estaEnAdopcion=" + estaEnAdopcion +
                ", tieneChip=" + tieneChip +
                ", estaLastimado=" + estaLastimado +
                '}';
    }
    public void setNombre(String nuevoNombre){
        nombre=nuevoNombre;
    }
    public void setAnoDeNacimiento(int nuevoAno){
        anoDeNacimiento=nuevoAno;
    }
    public void setEstaEnAdoption(){
        this.estaEnAdopcion=true;
    }
    public void setEstaLastimado(Boolean valor){ this.estaLastimado=valor; }

   public int consultarEdad(int anoActual){
            return anoActual-anoDeNacimiento;
    }
    public void ponerChip(){
        this.tieneChip=true;
    }
    public boolean esPerdible(){
        return !tieneChip;
    }
    public void ponerEnAdopcion(){ //POR QUE NO CAMBIA EL ESTADO DE ADOPCION ??
        this.estaEnAdopcion=true;
    }
    public String enviarEnAdopcion(){
        if(peso >= 5.0 && !estaLastimado){
            return "El perrito esta en condiciones de ser adoptado  =) =)";
        }
        return "El perrito NO esta en condiciones de ser adoptado :(";
    }

}
