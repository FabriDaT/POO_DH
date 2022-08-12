public class Usuariojuego {

    private String nombre;
    private String clave;
    private Double puntaje;
    private int nivel;

        public Usuariojuego(){
            puntaje = 0.0;
            nivel=0;
        }
        public Usuariojuego(String nombre, String clave){
            this.nombre = nombre;
            this.clave = clave;
            puntaje = 0.0;
            nivel=0;
        }
        public void aumentarPuntaje(){
            puntaje+=1.0;
        }
        public void subirNivel(){
            nivel++;
        }
        public void bonus(int valor){
            puntaje+= valor;
        }
        public String toString(){
            return ("\n El es Jugador: " + nombre +
                    "\n La clave es: " + clave +
                    "\n El puntaje es: " + puntaje +
                    "\n El nivel es: " + nivel);
        }
        public void setNombre(String nombre){
            this.nombre=nombre;
        }
        public String getNombre(){
            return nombre;
        }
        public void setClave(String pass){
            clave=pass;
        }
        public String getClave(){
            return clave;
        }



}
