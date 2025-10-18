
package ejercicio1;

public class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInfo(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
    }
}
