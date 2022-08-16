import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate fechaHoy=LocalDate.now();

        Perro perro1 = new Perro("Firulais", 7.12, "Caniche", 2018, true);
        System.out.println(perro1);
        System.out.println(fechaHoy);
        System.out.println(perro1.consultarEdad(2022));
        perro1.ponerChip();
        System.out.println("el perrito es perdible facilmente ??  " + perro1.esPerdible());
        System.out.println(perro1.enviarEnAdopcion());
        perro1.setEstaLastimado(false);
        perro1.setEstaEnAdoption();
        System.out.println(perro1.enviarEnAdopcion());

    }
}