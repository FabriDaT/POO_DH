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
        double auxiliar=monto;
        if (moneda.equals("Dolar"))
            auxiliar= auxiliar*150;
        //setSaldo(auxiliar+informarSaldo());
        super.depositar(auxiliar); // PREGUNTAR QUE HACE EL SUPER.DEPOSITAR ??
    }

    @Override
    public String mostrarDatos() {
        return "Saldo " + informarSaldo() + "Monto Descubierto " + montoDescubierto;
    }
}
