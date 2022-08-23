public class Asteroide extends Objeto {

    private int lesion;

    public Asteroide(int posx, int posy, char direccion, int lesion) {
        super(posx, posy, direccion);
        this.lesion=lesion;
    }

    public Asteroide() {
    }
    public void irA(int x, int y, char direccion){
        setPosx(x);
        setPosy(y);
        setDireccion(direccion);
    }
}
