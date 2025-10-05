
package ejercicio4;

public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Banco banco;
    private Cliente cliente;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco){
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjeta() != this){
            cliente.setTarjeta(this);
        }
    }

    public void mostrarTarjeta(){
        
        System.out.println("Tarjeta{numero=" + numero + ", vencimiento=" + fechaVencimiento + ", banco=" + banco + ", cliente=" + cliente + "}");
    }

    @Override
    public String toString(){
        
        return "Tarjeta{numero=" + numero + ", vencimiento=" + fechaVencimiento + "}";
    }
}
