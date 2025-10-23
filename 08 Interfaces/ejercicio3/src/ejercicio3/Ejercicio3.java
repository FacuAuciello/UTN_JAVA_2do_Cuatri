
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un texto para intentar convertir a numero: ");
        String texto = scanner.nextLine();

        try {

            int numero = Integer.parseInt(texto);
            System.out.println("Conversión exitosa. El numero es: " + numero);

        } catch (NumberFormatException e) {

            System.out.println("Error: El texto '" + texto + "' no es un numero entero válido");
            
        } finally {
            scanner.close();
            System.out.println("Proceso de conversión finalizado");
        }
    }
    }
    

