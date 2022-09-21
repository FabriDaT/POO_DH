public class Test {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("Pepito Construcciones");

        UnidadTrabajoFACTORY laFactoria = UnidadTrabajoFACTORY.getInstancia();
        UnidadSimple priUniSimple = (UnidadSimple)laFactoria.crearUnidadTrabajo("limpieza","equipoAKC","el rnr nenenn");
        priUniSimple.setCantidadDePersonas(6);
        priUniSimple.setMontoPorPersona(120000.0);
        UnidadSimple segunUniSimple = (UnidadSimple)laFactoria.crearUnidadTrabajo("mantenimiento","equipoLOFI","keseyoKULIA");
        segunUniSimple.setCantidadDePersonas(20);
        segunUniSimple.setMontoPorPersona(90000.0);
        UnidadCombinada priUniCombinada= (UnidadCombinada)laFactoria.crearUnidadTrabajo("servicios generales","equipoELMASPIJA","akakakakak");
        priUniCombinada.setCoeficienteGlobal(3.0);
        priUniCombinada.addUnidadesTrabajo(priUniSimple);
        priUniCombinada.addUnidadesTrabajo(segunUniSimple);
        UnidadCombinada segunUniCombinada = (UnidadCombinada)laFactoria.crearUnidadTrabajo("servicios generales","AKAKAK","loremakak");
        segunUniCombinada.addUnidadesTrabajo(priUniSimple);
        segunUniCombinada.addUnidadesTrabajo(segunUniSimple);
        segunUniCombinada.addUnidadesTrabajo(priUniCombinada);
        segunUniCombinada.calcularMonto();


        priUniCombinada.mostrar();
        segunUniCombinada.mostrar();
        priUniSimple.mostrar();


                //Asi lo hice primero, por que esta mal? o no es lo mas optimo ?
       /* laFactoria.crearUnidadTrabajo("limpieza","La wayaba team clean","lo+mejorWey");
        laFactoria.crearUnidadTrabajo("mantenimiento","MantenTEAM","Viva el pity");
        laFactoria.crearUnidadTrabajo("servicios generales","LaOstiaTEAM","lo que quieras wey");*/




    }
}
