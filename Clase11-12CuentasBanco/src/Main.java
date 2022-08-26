public class Main {
    public static void main(String[] args) {

        CajaAhorro ca = new CajaAhorro();
        ca.setSaldo(100);
        ca.cobrarIntereses();
        CuentaCorriente cc = new CuentaCorriente();
        cc.depositar(5000);
        cc.setDescubiertoPermitido(1000);

        System.out.println(ca.informarSaldo());
        System.out.println(cc.informarSaldo());

        ArrayList<Cuenta> cuentas= new ArrayList<>();
        Cuenta cuenta2=new CuentaCorriente();
        cuenta2.depositar(1000);

        Cuenta cuenta1=new CajaAhorro();
        cuenta1.depositar(1500);
        if (cuenta2 instanceof  CuentaCorriente)
            ((CuentaCorriente)cuenta1).setDescubiertoPermitido(2000);

        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        for( Cuenta c: cuentas)
        {
            System.out.println(c.mostrarDatos());
        }



    }
}