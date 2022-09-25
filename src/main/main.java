package monedero;
import java.util.Scanner;

public class main {

    private static int cantidad;
public static void main(String[]args){
Scanner leer=new Scanner(System.in);
int opcion;

   cantidad = 500;
 System.out.println("Tu Saldo Actual es:");

double cantidad = 500;
  System.out.println("Q"+cantidad);
Monedero monedero=new Monedero(cantidad);

do {
System.out.println("1*-----Ingrese el dinero-----");
System.out.println("2*----- Retire el dinero-----");
System.out.println("3*-----Consulte su Cuenta-----");
System.out.println("4*----- salir-----");
opcion= leer.nextInt();
switch (opcion){
case 1:
System.out.println("Cunto dinero desea ingresar:");
double meter= leer.nextDouble();
monedero.DepositeDinero(meter);
break;
case 2:
System.out.println("cuanto dinero desea retirar: ");
double sacar = leer.nextDouble();
monedero.RetirarDinero(sacar);
break;
case 3:
System.out.println("Tu saldo es de:Q"+ monedero.EstadoCuenta() );
break;
}
}while (opcion!=4);


}
}

