
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese numerador: ");
            int a = sc.nextInt();
            System.out.print("Ingrese denominador: ");
            int b = sc.nextInt();
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero");
        }
    }
}
  
