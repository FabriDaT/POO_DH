public class Main {

    public static void main(String[] args) {
        Alumno jorge = new Alumno("jorge","ruiz","ax6453");
        Alumno luisito = new Alumno("luisito","rockandroll","az1223");
        ExamenFinal final1 = new ExamenFinal("biologiaI","bla bla bla",6.5,jorge,10.0,"kakakak");
        ExamenFinal final2 = new ExamenFinal("FisicaI","bla bla bla",2.5,luisito,6.0,"kakakak");
        System.out.println(final1.SacarPromedio());
        final1.estaAprobado();
        final2.estaAprobado();
        System.out.println(final1.compareTo(final2));
        System.out.println(final2.toString());

        ExamenParcial parcialAbril = new ExamenParcial("Casosx","lalakaka",5.5,luisito,7);
        ExamenParcial parcialMayo = new ExamenParcial("Cositas","pepereree",2.5,jorge,1);
         parcialMayo.vaArecuperar();
         parcialMayo.setNota(3.2);
         parcialMayo.vaArecuperar();

        System.out.println(parcialMayo.getCantidadReintentos());
        System.out.println(parcialMayo.esPosibleRecuperar(1));



    }
}