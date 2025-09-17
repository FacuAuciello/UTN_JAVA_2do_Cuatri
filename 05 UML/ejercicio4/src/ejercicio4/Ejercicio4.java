
package ejercicio4;

public class Ejercicio4 {

    public static void main(String[] args) {
        Banco banco = new Banco("Galicia", "30123456789");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("4509-1234-5678-9010", "12/27", banco);
        Cliente cliente = new Cliente("Agustin", "40566912");

        tarjeta.setCliente(cliente);
        tarjeta.mostrarTarjeta();
        
        System.out.println("Tarjeta del cliente: " + cliente.getTarjeta());
        
    }
}
    

