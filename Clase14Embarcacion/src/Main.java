public class Main {
    public static void main(String[] args) {

        System.out.println("Hola mundo de las embarcaciones");

        Embarcacion embarcacion;
        Capitan capi;

        capi = new Capitan("Juan","De los 7 mares","SEA3311");
        embarcacion = new Veleros(capi, 300000.0,4000.0, 2015, 30.50, 5);
        capi= new Capitan("Pedro","Barba Azul","SEA5544");
        embarcacion = new Yates(capi, 99999999999.9, 500000.9, 2022, 80.50, 50 );

    }
}