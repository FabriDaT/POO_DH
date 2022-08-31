public class CajaDeAhorro extends Cuenta {

    private static final double tasaDeInteres=1.2;

    public CajaDeAhorro(double saldo) {
        super(saldo);
    }

    public CajaDeAhorro() {
    }

    @Override
    public void extraerEfectivo(int monto) {
       if (informarSaldo()>=monto) {
           setSaldo(informarSaldo()-monto);
       }else System.out.println("Saldo Insuficiente");
    }
    public void cobrarIntereses(){
        setSaldo(informarSaldo()*CajaDeAhorro.tasaDeInteres);
    }
    public String mostrarDatos(){
        return "CAJA DE AHORRO  ---> Saldo " + informarSaldo() + " Intereses " + CajaDeAhorro.tasaDeInteres;
    }
}
