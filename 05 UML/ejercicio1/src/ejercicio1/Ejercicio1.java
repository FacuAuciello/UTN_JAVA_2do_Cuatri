
package ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        Pasaporte pasaporte = new Pasaporte("1234", "09/09/19", "01", ".PNG");
        Titular titular = new Titular("Javier Lopez", "38564428");
        
        pasaporte.setTitular(titular);
        
        System.out.println("Pasaporte: " + titular.getPasaporte());
        System.out.println("Titular del pasaporte: " + pasaporte.getTitular());
    }
    
}
