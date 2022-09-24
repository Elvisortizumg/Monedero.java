package monedero;

public class Monedero {
double dinero;

public Monedero(double dinero) {
this.dinero = dinero;
}
public void DepositeDinero(double dinero) {
this.dinero += dinero;
}
public void RetirarDinero(double dinero) {
if (this.dinero<dinero){
System.out.println(" No tiene suficientes fondos ");
}else{
this.dinero -= dinero;
}
}
public double EstadoCuenta() {
return this.dinero;
}

}
