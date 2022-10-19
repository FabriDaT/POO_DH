public class Test {
    public static void main(String[] args) {

        Personaje personaje = new Personaje("Mario");
        HabilidadesFACTORY HabilidadesFactory = HabilidadesFACTORY.getInstancia();
        Simple habilidad1 = (Simple)HabilidadesFactory.crearHabilidades("HS","Saltar","salta");
        habilidad1.setPuntaje(7.5);

        Simple habilidad2 = (Simple)HabilidadesFactory.crearHabilidades("HS","Disparar","dispara");
        habilidad2.setPuntaje(10.0);

        Combinada habilidad3 = (Combinada)HabilidadesFactory.crearHabilidades("HC","Disparo al saltar","salta y dispara");
        habilidad3.setFactorMultiplicador(3);
        habilidad3.agregarHabilidades(habilidad1);
        habilidad3.agregarHabilidades(habilidad2);

    }
}