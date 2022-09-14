public class Main {
    public static void main(String[] args) {
        Puerto puerto = new Puerto("Puerto de Buenos Aires");

        Contenedor contenedorY = new Contenedor(44,"Desconocido",true);
        Contenedor contenedorX = new Contenedor(33,"China",false);
        Contenedor contenedorXY = new Contenedor(22,"Rusia",true);
        Contenedor contenedorXYX = new Contenedor(11,"Desconocido",true);
        Contenedor contenedorXXY = new Contenedor(99,"Brasil",true);

        puerto.ingresarContenedor(contenedorX);
        puerto.ingresarContenedor(contenedorY);
        puerto.ingresarContenedor(contenedorXXY);
        puerto.ingresarContenedor(contenedorXY);
        puerto.ingresarContenedor(contenedorXYX);
        System.out.println("Cantidad de contenedores con materiales peligrosos de origen desconocido: " + puerto.calcularCantidadContenedoresPeligrosos());

        System.out.println(puerto.toString()); // Sin ordenar

        puerto.ordenar();

        System.out.println(puerto.toString());  // Ya ordenado

    }
}