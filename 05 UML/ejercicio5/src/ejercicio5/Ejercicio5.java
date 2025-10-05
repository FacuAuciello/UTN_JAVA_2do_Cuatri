
package ejercicio5;

public class Ejercicio5 {

    public static void main(String[] args) {
        Computadora computadora = new Computadora("Lenovo", "2829XXX", "AB-100", "HM300");
        Propietario propietario = new Propietario("Facu", "45983012");
        
        computadora.setPropietario(propietario);

        System.out.println("Propietario de la computadora: " + computadora.getPropietario());
        System.out.println("Computadora del propietario: " + propietario.getComputadora());
        System.out.println("Placa madre: " + computadora.getPlacaMadre());
    }
    }
    

