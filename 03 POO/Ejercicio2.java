package ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        Mascotas m = new Mascotas();
        
        m.nombre = "Pancho";
        m.especie = "Perro";
        m.edad = 2;
        
        m.mostrarInfo();
        m.cumplirAnios(5);
        m.mostrarInfo();
    }
    
}
    class Mascotas{
    
    String nombre;
    String especie;
    int edad;
    
    void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }
    
    void cumplirAnios(int anios){
        edad += anios;
    }
}
    
