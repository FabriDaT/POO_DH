import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Perro {
    private boolean enAdopcion;
    private String nombre;
    private String raza;
    private LocalDate fechaNacimiento;
    private Double peso;
    private boolean tieneChip;
    private boolean estaLastimado;
    private boolean estaEnfermo;

    public Perro(String nombre, String raza, LocalDate fechaNacimiento, Double peso, boolean tieneChip, boolean estaLastimado, boolean estaEnfermo) {
        enAdopcion = false;
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.tieneChip = tieneChip;
        this.estaLastimado = estaLastimado;
        this.estaEnfermo = estaEnfermo;
    }

    public Perro(String nombre, String raza, LocalDate fechaNacimiento, Double peso) {
        enAdopcion = false;
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        tieneChip = false;
        estaLastimado = false;
        estaEnfermo = false;
    }

    public Perro(){

    }

    public boolean esPerdible(){
        return !tieneChip;
    }

    public int getEdad(){
        LocalDate today = LocalDate.now();
        Period p = Period.between(fechaNacimiento, today);
        return p.getYears();
    }

    public boolean darEnAdopcion() {
        enAdopcion = !estaLastimado && peso > 5.0 && enAdopcion ? true : false;
        return enAdopcion;
    }

    public void alimentarPerro(Double pesoComida){
        peso += pesoComida;
    }

    public void lastimarPerro(){
        estaLastimado = true;
    }

    public void curarPerro(){
        estaLastimado = false;
    }

    public void ponerChip(){
        tieneChip = true;
    }

    public boolean isEnAdopcion() {
        return enAdopcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Double getPeso() {
        return peso;
    }

    public boolean isTieneChip() {
        return tieneChip;
    }

    public boolean isEstaLastimado() {
        return estaLastimado;
    }

    public boolean isEstaEnfermo() {
        return estaEnfermo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
