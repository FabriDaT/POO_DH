import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner objeto; //definicion de un objeto Scanner llamado "objeto",para el ingreso de datos por teclado
        objeto = new Scanner(System.in); // creacion o instanciacion del objeto

        int num1;
        int num2;
        float coeficiente;
        String frase;
        char caracter;


        System.out.println("ingrese primer numero");
        objeto.nextLine();
        System.out.println("ingrese segundo numero");
        num2 = objeto.nextInt();
        objeto.nextLine();
        System.out.println("ingrese coeficiente");
        coeficiente = objeto.nextFloat();
        objeto.nextLine();
        System.out.println("ingrese una frase o palabra");
        frase = objeto.nextLine();
        System.out.println("Primera letra de la frase anterior o letra");
        caracter = frase.charAt(0);
        System.out.println(caracter);
    }
}