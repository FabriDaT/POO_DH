import java.util.Scanner;

/*
* Este tipo de cuenta al depositar se quedan con un
1% de la comisión con lo cual al depositar solo nos depositara el 99% del monto (no
nos preocupemos a dónde irá ese 1%). Por otro lado, solo se puede extraer hasta el
50% en una operación, excepto que se suministre al momento de la extracción la
clave de validación. Es decir que para extraer deben existir estas dos posibilidades.
En el main() se debe tratar a todos los objetos como Cuenta y, en el caso de
necesitar invocar un método de una clase concreta, castear la misma.*/
public class CuentaComitente extends Cuenta {
    private String claveCNV;

    @Override
    public void depositar(double monto) {
        super.depositar(monto-(99*monto/100));
    }

    public CuentaComitente(double saldo, String claveCNV) {
        super(saldo);
        this.claveCNV = claveCNV;
    }

    public CuentaComitente(double saldo) {
        super(saldo);
    }

    public void setClaveCNV(String claveCNV) {
        this.claveCNV = claveCNV;
    }

    public String getClaveCNV() {
        return claveCNV;
    }

    public CuentaComitente(String claveCNV) {
        this.claveCNV = claveCNV;
    }

    @Override
    public void extraerEfectivo(int monto) {
        Scanner sc = new Scanner(System.in);
        String  clave;

        if (monto <= (50*informarSaldo()/100)) {
            System.out.println("Realizando extraccion de dinero");
            setSaldo(this.saldo - monto);
        }
        if (monto > (50*informarSaldo()/100)) {
            System.out.println("Ingrese su clave CNV para extraer el monto deseado");
            clave = sc.nextLine();
            if (clave.equals(getClaveCNV())) {
                System.out.println("Clave correcta, extrayendo dinero....");
                setSaldo(this.saldo - monto);
            }
            else System.out.println("Clave incorrecta, extaccion cancelada...");
        }

    }


    @Override
    public String mostrarDatos() {
         return "CUENTA COMITENTE ---->  Saldo " + informarSaldo() +
                " claveCNV= ***** ";
    }

}
