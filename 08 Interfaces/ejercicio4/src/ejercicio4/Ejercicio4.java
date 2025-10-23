
package ejercicio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
       
        String pathDelArchivo = "mi_archivo.txt";

        try {
            File archivo = new File(pathDelArchivo);
            Scanner fileScanner = new Scanner(archivo);

            System.out.println("Contenido del archivo '" + pathDelArchivo + "':");
            
            
            while (fileScanner.hasNextLine()) {
                String linea = fileScanner.nextLine();
                System.out.println(linea);
            }
            
        
            fileScanner.close();

        } catch (FileNotFoundException e) {
            
            System.out.println("Error: El archivo no fue encontrado en la ruta: " + pathDelArchivo);
            
            
        } finally {
            System.out.println("\nProceso de lectura de archivo finalizado.");
        }
    }
    }
    

