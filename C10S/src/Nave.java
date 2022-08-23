public class Nave extends Objeto {

    private double velocidad;
    private int vida;

    public Nave(int posx, int posy, char direccion, double velocidad) {
        super(posx, posy, direccion);
        this.velocidad=velocidad;
    }
    public Nave() {
    }
    public void setVida(int valor){
        this.vida=valor;
    }
    public int getVida(){
        return  this.vida;
    }

    @Override
    public void irA(int x, int y, char direccion) {
        super.irA(x, y, direccion);
        if (getDireccion() != direccion) {
            girar(direccion);
        }
    }
    public void girar(char direccion){
        setDireccion(direccion);
    }
    public void restaVida(int valor){
        this.vida -= valor;
    }
}
