package com.company;

public class Main {

    public static void cargarDatosCurso(Curso c, int carga, int meses, double precio)
    {
        c.setPrecioHora(precio);
        c.setMesesDuracion(meses);
        c.setCargaHoraria(carga);
    }

    public static void main(String[] args) {

        OfertaAcademicaFactory ofertaAcademicaFactory=OfertaAcademicaFactory.getInstancia();
        Instituto instituto= new Instituto("DH");
        Curso curso1= (Curso)ofertaAcademicaFactory.crearOfertaAcademica(OfertaAcademicaFactory.CURSO,"Front End", "fdjfkldskl");
        cargarDatosCurso(curso1, 16, 2,1000);
        Curso curso2= (Curso)ofertaAcademicaFactory.crearOfertaAcademica(OfertaAcademicaFactory.CURSO,"Back End", "fdjfkldskl");
        cargarDatosCurso(curso2, 20,2,900);
        ProgramaIntensivo programaIntensivo1=(ProgramaIntensivo)ofertaAcademicaFactory.crearOfertaAcademica(OfertaAcademicaFactory.PROGRAMA_INTENSIVO,"Full Strack", "dkjj");
        programaIntensivo1.setDescuento(20);
        programaIntensivo1.agregarCurso(curso1);
        programaIntensivo1.agregarCurso(curso2);
        instituto.agregarOferta(curso1);
        instituto.agregarOferta(curso2);
        instituto.agregarOferta(programaIntensivo1);
        System.out.println(instituto.generarInforme());
    }
}
