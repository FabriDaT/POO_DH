public class Main {
    public static void main(String[] args) {
        Puerto puerto = new Puerto("Puerto de Buenos Aires");

        Contenedor contenedorY = new Contenedor(44,"Desconocido",true);
        Contenedor contenedorX = new Contenedor(33,"China",false);
        Contenedor contenedorXY = new Contenedor(22,"Rusia",true);
        Contenedor contenedorXYX = new Contenedor(11,"Desconocido",false);
        Contenedor contenedorXXY = new Contenedor(99,"Brasil",true);

        puerto.ingresarContenedor(contenedorX);
        puerto.ingresarContenedor(contenedorY);
        puerto.ingresarContenedor(contenedorXXY);
    }
}