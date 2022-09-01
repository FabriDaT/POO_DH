public class Main {
    public static String obtenerYateMasLujoso(Yate yate1,Yate yate2){
        int resultado=yate1.compareTo(yate2);
        if (resultado==0){
            return "Ambos yates son del mismo lujo";
        }
        else if(resultado>0){
            return "El yate: "+ yate1.getNombre()+" es mas lujoso";
        }
        else {
            return "El yate "+ yate2.getNombre()+" es mas lujoso";
        }
    }
    public static void main(String[] args) {
        //Creamos al capitan america
        Capitan capitan1=new Capitan("Steve","Rogers","123");
        System.out.println(capitan1.toString() );

        //creamos el velero
        Velero velero1= new Velero(100.05,50.5,2021,50,capitan1,5);
        System.out.println(velero1.toString()+"\n");
        //probamos el valor de alquiler del velero
        System.out.println("El valor de alquiler del velero es "+velero1.calcularMontoAlquier());

        //creamos el primer yate
        Yate yate1=new Yate(100.05,50.5,2021,50,capitan1,5,"El mas peola");
        Yate yate2=new Yate(100.05,50.5,2021,50,capitan1,4,"El mas caca");
        //comparamos cual yate es mas lujoso
        System.out.println(obtenerYateMasLujoso(yate1,yate2));

    }
}