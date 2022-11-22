import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int menu,op;
        Cajero_Atm Catm=new Cajero_Atm();
        do {
            Catm.mostrarMenu();
            System.out.println("Elija una de las Opciones");
            menu=sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("\tOPCION 1 ");
                    System.out.println("consulta de saldos\n");
                    System.out.println("Nombre/titular cuenta"+Catm.getNombre_cuenta());
                    System.out.println("Numero Cuenta: "+Catm.getN_cuenta());
                    System.out.println("Numero de Cedula Titular: "+Catm.getN_cedula());
                    System.out.println("Saldo total: "+Catm.getC_ahorros());

                    break;
                case 2:
                    System.out.println("\tOPCION 2");
                    System.out.println("RETIRO DE DINERO");
                    Catm.Retirar();
                    break;

                default:
                    System.out.println("Opcion Incorrecta!!");
                    break;
            }
            System.out.println("Continuar");
            op = sc.nextInt();

        }while (op==1);

    }
}