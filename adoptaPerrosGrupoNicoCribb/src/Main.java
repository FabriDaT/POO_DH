import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Jorgito", "caniche", LocalDate.of(1990, Month.JANUARY, 1), 2.3, true, false, false);

        System.out.println(perro1.getEdad());


    }
}