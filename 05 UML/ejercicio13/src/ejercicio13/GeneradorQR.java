
package ejercicio13;

public class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor);
        System.out.println("El usuario creado se llama: " + usuario.getNombre());
    }
}
