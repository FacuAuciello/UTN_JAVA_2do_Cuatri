
package ejercicio5;

import static ejercicio5.ValidarEdad.verificarEdad;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese una edad para validar: ");
            int edad = scanner.nextInt();
            
            verificarEdad(edad);

        } catch (EdadInvalidaException e) {
            
            System.out.println("Error de validacion: " + e.getMessage()); 
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un numero entero");
            
        } finally {
            scanner.close();
            System.out.println("Proceso de validacion finalizado");
        }
    }
    }
    

