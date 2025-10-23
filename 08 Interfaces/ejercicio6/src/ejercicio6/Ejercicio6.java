
package ejercicio6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio6 {

    public static void main(String[] args) {
        String pathDelArchivo = "txt6.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(pathDelArchivo))) { 

            System.out.println("Contenido del archivo '" + pathDelArchivo + "':");
            String linea;
            
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
       
            System.out.println("Error: Archivo no encontrado en la ruta: " + pathDelArchivo);
            
        } catch (IOException e) {
            
            System.out.println("Error de E/S al leer el archivo: " + e.getMessage()); 
            
        }
        
        System.out.println("\nProceso de lectura (con resources) finalizado.");
    }
   }
    
