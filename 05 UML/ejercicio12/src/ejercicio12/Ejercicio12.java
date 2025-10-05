
package ejercicio12;

public class Ejercicio12 {

    public static void main(String[] args) {
       Impuesto impuesto = new Impuesto(10000);
       Contribuyente contribuyente = new Contribuyente("Felipe", "27-28033514-8");

       impuesto.setContribuyente(contribuyente);
       impuesto.mostrarContribuyente();

       Calculadora calculadora = new Calculadora();
       calculadora.calcular(impuesto);
    }
    
}
