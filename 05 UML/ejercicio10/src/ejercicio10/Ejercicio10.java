
package ejercicio10;

public class Ejercicio10 {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("2850595201", 100000.0);
        Titular titular = new Titular("Sofia", "40111222");

        cuenta.setTitular(titular);

        System.out.println("Detalle cuenta: " + titular.getCuenta());
        
        cuenta.mostrarClave();
    }
    }
   
