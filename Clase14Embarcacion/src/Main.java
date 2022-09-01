public class Main {
    public static void main(String[] args) {

        System.out.println("Hola mundo de las embarcaciones");

        Embarcacion embarcacion;
        Capitan capi;

        capi = new Capitan("Juan","De los 7 mares","SEA3311");
        Veleros velero1 = new Veleros(500000.5, 5000.52,2015,10.3,capi,6);
        Veleros velero2 = new Veleros(5045400.5, 6000.52,2022,8.3,capi,2);
        capi= new Capitan("Pedro","Barba Azul","SEA5544");
        Yates yate1= new Yates(100000000000.0,20000.0,2021,20.50,capi,10 );
        Yates yate2= new Yates(10000000.0,2000.0,2019,15.50,capi,5 );
        System.out.println(yate1.compareTo(yate2));
        System.out.println(velero1.toString());
        System.out.println(yate1.toString());
        velero1.evaluarSiEsGrande();

    }
}