import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        Dueño dueño1 = new Dueño("Juan Carlos","Perez","15305559992");
        Dueño dueño2 = new Dueño("Jose Rodolfo","Aballay","20353214564");

        Casa casaRecoleta = new Casa(LocalDate.of(2021, Month.MAY,23),150000.0,"Av.Libertador 1504 sur", false,dueño1,8,300.0);
        Casa casaZonaSur = new Casa(LocalDate.of(2011, Month.JULY,13),50000.0,"Av.JoseCPaz 154 este", true,dueño1,4,120.5);

        Campo campo1 = new Campo(LocalDate.of(2001, Month.MAY,1),4565.5,"Ruta 9 km 10",true,dueño2,false,5000.2);
        Campo campo2 = new Campo(LocalDate.of(2007, Month.MAY,10),1000.5,"Ruta 102 km 50",false,dueño2,true,1120.2);


    }
}