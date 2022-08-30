import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cuenta CajaAhorroPEPE = new CajaDeAhorro(90000); // caja de ahorra es una Cuenta, dinamic bylding
        Cuenta CuentaCorrienteJORGE = new CuentaCorriente(12500,2000);
        Cuenta ComitenteLUISITO = new CuentaComitente(4000, "abcd1234");

        CuentaCorrienteJORGE.extraerEfectivo(2500);
        ((CajaDeAhorro) CajaAhorroPEPE).cobrarIntereses();
        CajaAhorroPEPE.extraerEfectivo(50000);

        ((CuentaCorriente) CuentaCorrienteJORGE).depositar(1500, "Dolar");
        ((CuentaComitente) ComitenteLUISITO).setClaveCNV("lalala666");
        ((CuentaComitente) ComitenteLUISITO).extraerEfectivo(3000);


        ArrayList<Cuenta> cuentas = new ArrayList<>();
        cuentas.add(CajaAhorroPEPE);
        cuentas.add(ComitenteLUISITO);
        cuentas.add(CuentaCorrienteJORGE);
        for (Cuenta c : cuentas) {
            System.out.println(c.mostrarDatos());
        }


    }
}