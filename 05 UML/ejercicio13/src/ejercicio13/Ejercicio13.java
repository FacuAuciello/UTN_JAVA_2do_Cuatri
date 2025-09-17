
package ejercicio13;

public class Ejercicio13 {

    public static void main(String[] args) {
        CodigoQR qr = new CodigoQR("codigo");
        Usuario usuario = new Usuario("Marisa", "34");
        GeneradorQR generadorQR = new GeneradorQR();


        qr.setUsuario(usuario);
        qr.mostrarQR();
        generadorQR.generar("codigo", usuario);
    }
    
}
