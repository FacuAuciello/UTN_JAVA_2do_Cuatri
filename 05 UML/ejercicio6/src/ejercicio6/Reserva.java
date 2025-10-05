
package ejercicio6;

public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente;
    private Mesa mesa;

    public Reserva(String fecha, String hora){
        this.fecha = fecha;
        this.hora = hora;
    }

    public Reserva(String fecha, String hora, Mesa mesa){
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void setMesa(Mesa mesa){
        this.mesa = mesa;
    }

    @Override
    public String toString(){
        
        return "Reserva{fecha=" + fecha + ", hora=" + hora + ", " + cliente + ", " + mesa + "}";
    }
}
