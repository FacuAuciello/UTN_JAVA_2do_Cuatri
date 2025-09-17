
package ejercicio5;

public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora;

    public Propietario(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setComputadora(Computadora computadora){
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() != this){
            computadora.setPropietario(this);
        }
    }

    public Computadora getComputadora(){
        return computadora;
    }

    @Override
    public String toString(){
        
        return "Propietario{nombre=" + nombre + ", dni=" + dni + "}";
    }
}
