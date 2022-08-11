import java.util.Scanner;

public class CLASE3S {

    /* PIEDRA ,PAPEL O TIJERA !!

    Desafío 1
    Hacé un programa que te permita jugar a “Piedra, papel o tijera”. En primer lugar, la
    aplicación solicita el nombre de cada gamer, después empieza el juego. El juego consiste
    en pedir qué opción elije cada uno y sumar puntos al winner —si lo hay—. Definí y utilizá
    una función llamada cualGana con dos parámetros con las jugadas de cada uno, que
    devuelve 0 en caso de empate, 1 si gana el primero, 2 si gana el segundo. El juego termina
    cuando el primero elije “*” como indicador de final.
     */

    public static String opciones(String nombreJugador){
        String op;
        do {
            System.out.println("Selecciones una opción: " + nombreJugador);
            System.out.println("1 - Piedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tijera");
            System.out.println("* - Salir");

            Scanner sc = new Scanner(System.in);
            op = sc.nextLine();
            if (!op.equals("1") && !op.equals("2") && !op.equals("3") && !op.equals("*")){
                System.out.println("Opcion Invalida!!");
            }
        }  while (!op.equals("1") && !op.equals("2") && !op.equals("3") && !op.equals("*"));
        return op;
    }

    public static int cualGana(String op1, String op2){
        if (op1.equals("1") && op2.equals("3") || op1.equals("2") && op2.equals("1") || op1.equals("3") && op2.equals("2")) {
            return 1;
        } else if (op1.equals("1") && op2.equals("2") || op1.equals("2") && op2.equals("3") || op1.equals("3") && op2.equals("1")) {
            return 2;
        } else if (op1.equals(op2)) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jugador1="";
        String jugador2="";
        String op1="";
        String op2="";
        int resultado;
        int score1=0;
        int score2=0;

        System.out.println("Ingrese nombre jugador1");
        jugador1 = sc.nextLine();

        System.out.println("Ingrese nombre jugador2");
        jugador2 = sc.nextLine();

        System.out.println("------------EL  JUEGO COMIENZA-------------");

        do {
            op1 = opciones(jugador1);
            if (op1.equals("*")){
                System.out.println("Fin del juego!");
                break;
            }
            op2=opciones(jugador2);
            if (op2.equals("*")){
                System.out.println("Fin del juego!");
                break;
            }

            resultado = cualGana(op1, op2);
            if (resultado == 1){
                score1++;
                System.out.println("GANA " + jugador1);
            } else if (resultado == 2) {
                score2++;
                System.out.println("GANA " + jugador2);
            } else if (resultado == 0){
                System.out.println("EMPATE");
            }
            System.out.println("------------------");


        }  while (resultado != -1);
    }
}
