import java.util.Scanner;

public class Cajero_Atm {

    Scanner sc = new Scanner(System.in);
    String Nombre_cuenta;
    String N_cedula;
    String N_cuenta;

    public String getNombre_cuenta() {
        return Nombre_cuenta;
    }

    public void setNombre_cuenta(String nombre_cuenta) {
        Nombre_cuenta = nombre_cuenta;
    }

    public String getN_cedula() {
        return N_cedula;
    }

    public void setN_cedula(String n_cedula) {
        N_cedula = n_cedula;
    }

    public String getN_cuenta() {
        return N_cuenta;
    }

    public void setN_cuenta(String n_cuenta) {
        N_cuenta = n_cuenta;
    }

    public double getC_ahorros() {
        return C_ahorros;
    }

    public void setC_ahorros(double c_ahorros) {
        C_ahorros = c_ahorros;
    }

    double C_ahorros;

    public Cajero_Atm() {
        Nombre_cuenta = "Alexis Chasi";
        N_cedula = "0708090901";
        N_cuenta = "201587863";
        C_ahorros = 500.50;


    }

    public void mostrarMenu() {
        System.out.println(" CAJERO-ATM");
        System.out.println("1. Consulta");
        System.out.println("2. Retiro ");
    }

    public void Retirar() {
        double Cantidad_retiro;
        System.out.print("Cuanto desea retirar ");
        Cantidad_retiro = sc.nextDouble();
        if (Cantidad_retiro > C_ahorros) {
            System.out.println("FONDOS INSUFICIENTES PARA REALIZAR EL RETIRO");
        } else {
            Double C_ahorros_total = C_ahorros - Cantidad_retiro;
            setC_ahorros_total(C_ahorros_total);
            System.out.println("Su saldo: " + getC_ahorros());
        }

    }


    public void setC_ahorros_total(double c_ahorros) {
        this.C_ahorros = c_ahorros;
    }
}
