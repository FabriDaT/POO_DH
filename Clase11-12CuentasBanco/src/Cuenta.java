public abstract class Cuenta {
    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }
    public Cuenta() {}
    public  void depositar(double monto){
        saldo +=monto;
    }
    public abstract void extraerEfectivo(int monto);
    public double informarSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public abstract String mostrarDatos();
}
