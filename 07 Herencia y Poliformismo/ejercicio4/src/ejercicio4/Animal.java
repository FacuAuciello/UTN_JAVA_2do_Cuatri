
package ejercicio4;

public class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void hacerSonido(){
        System.out.println("El animal hace un sonido...");
    }

    public void describirAnimal(){
        System.out.println("Soy un animal y mi nombre es " + getNombre());
    }
}
