# prueba1
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int menu,op; // creamos variables para poder hacerlo con un menu y una variable op para poder continuar con el programa
        Cajero_Atm Catm=new Cajero_Atm(); //instanciamos la clase con nuestro objeto
        do {// usamos un ciclo do-while para poder usar el menu
            Catm.mostrarMenu();
            System.out.println("Elija una de las Opciones");
            menu=sc.nextInt();
            switch (menu) {//hacemos un switch case para las 2 opciones del menu
                case 1: //en el caso 1 ponemos la consulta de los datos
                    System.out.println("\tOPCION 1 ");
                    System.out.println("consulta de saldos\n");
                    System.out.println("Nombre/titular cuenta"+Catm.getNombre_cuenta());
                    System.out.println("Numero Cuenta: "+Catm.getN_cuenta());
                    System.out.println("Numero de Cedula Titular: "+Catm.getN_cedula());
                    System.out.println("Saldo total: "+Catm.getC_ahorros());

                    break;
                case 2:// en el caso dos ponemos el retiro de dinero implementando un metodo dentro de la clase Cajero_Atm 
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
