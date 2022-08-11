public class Articulo {

    private String descripcion;
    private  double   precioVenta;
    private int  stock;


        public Articulo(String descripcion, int cantidad, double precio){
            this.descripcion=descripcion;
            precioVenta=precio;
            stock= cantidad;
        }
        public boolean hayStock(){
            return stock>0;
        }
        public double consultarPrecio(){
            return  precioVenta;
        }

    public static void main(String[] args) {
            Articulo articulo =  new Articulo("Silla Gammer Corsair", 50, 12000.99);

            if (articulo.hayStock()){
                System.out.println("Hay stock disponible de " + articulo.descripcion);
            }
        System.out.println("El precio de venta de " + articulo.descripcion + " es de " + articulo.consultarPrecio() + " pesos arg");
    }
}


