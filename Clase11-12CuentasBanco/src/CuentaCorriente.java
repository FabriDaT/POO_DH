public class CuentaCorriente extends  Cuenta{
    private double montoDescubierto;

    public CuentaCorriente(double saldo, double montoDescubierto) {
        super(saldo);
        this.montoDescubierto = montoDescubierto;
    }

    public CuentaCorriente(double montoDescubierto) {
        this.montoDescubierto = montoDescubierto;
    }

    @Override
    public void extraerEfectivo(int monto) {
       if (informarSaldo() < monto) setSaldo(informarSaldo()-montoDescubierto);

    }



    public void setMontoDescubierto(double montoDescubierto) {
        this.montoDescubierto = montoDescubierto;
    }
    public void depositar(double monto, String moneda)
    {
        double auxiliar;
        if (moneda.equals("Dolar")){
            auxiliar= monto*150;
        }else{
            auxiliar=monto;
        }

        //setSaldo(auxiliar+informarSaldo());
        super.depositar(auxiliar); // PREGUNTAR QUE HACE EL SUPER.DEPOSITAR ?? llama al metodo "depositar" de la superClase
    }

    @Override
    public String mostrarDatos() {
        return "CUENTA CORRIENTE --> Saldo " + informarSaldo() + " Monto Descubierto " + montoDescubierto;
    }
}
