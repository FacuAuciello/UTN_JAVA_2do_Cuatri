
package ejercicio6;

public class Mesa {
    private int numero;
    private String capacidad;

    public Mesa(int numero, String capacidad){
        this.numero = numero;
        this.capacidad = capacidad;
    }

    @Override
    public String toString(){
        
        return "Mesa{numero=" + numero + ", capacidad=" + capacidad + "}";
    }
}
