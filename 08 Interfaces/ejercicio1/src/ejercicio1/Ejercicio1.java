
package ejercicio1;

public class Ejercicio1 {

    
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Facu");
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(new Producto("Mouse", 5000));
        pedido.agregarProducto(new Producto("Teclado", 8000));

        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        PagoConDescuento pagoTarjeta = new TarjetaCredito();
        double totalConDescuento = pagoTarjeta.aplicarDescuento(total);
        pagoTarjeta.procesarPago(totalConDescuento);

        pedido.cambiarEstado("Enviado");
    }
    
}
