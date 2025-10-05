
package ejercicio4;

public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;

    public Cliente(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public TarjetaDeCredito getTarjeta(){
        return tarjeta;
    }

    public void setTarjeta(TarjetaDeCredito tarjeta){
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString(){
        
        return "Cliente{nombre=" + nombre + ", dni=" + dni + "}";
    }
}
