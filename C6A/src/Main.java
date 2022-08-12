public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! Are you there USUARIOXXX??");

        Usuariojuego usuario1= new Usuariojuego("Pepitoo","asdf123");
        Usuariojuego usuario2= new Usuariojuego("JAMES", "kfsdjl");
        Usuariojuego usuario3= new Usuariojuego("Robert","hiloshilosjisi");

        usuario1.aumentarPuntaje();
        usuario1.aumentarPuntaje();
        usuario2.aumentarPuntaje();
        usuario3.aumentarPuntaje();

        usuario3.subirNivel();
        usuario1.subirNivel();
        usuario2.subirNivel();
        usuario3.subirNivel();
        usuario2.bonus(450);
        usuario1.bonus(2000);

        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println(usuario3);

        usuario1.setNombre("TROY MC KLUR Wee");
        System.out.println(usuario1.getNombre());
        System.out.println(usuario1);



    }
}