
package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

    public static void main(String[] args) {
       List<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Lasie"));
        animales.add(new Gato("Luis"));
        animales.add(new Vaca("Macarena"));

        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido();
            System.out.println("");
        }

    } 
    }
    

