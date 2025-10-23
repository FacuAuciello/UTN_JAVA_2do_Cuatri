
package ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ValidarEdad {
    
    public static void verificarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad fuera de rango. Se esperaba entre 0 y 120"); 
        }
        System.out.println("Edad ingresada (" + edad + ") es valida");
    }
}
