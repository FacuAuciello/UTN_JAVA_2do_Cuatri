
package ejercicio13;

public class CodigoQR {
    private String valor;
    private Usuario usuario;

    public CodigoQR(String valor){
        this.valor = valor;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public void mostrarQR(){
        if (usuario != null){
            System.out.println("Usuario: " + usuario.getNombre() + " Edad: " + usuario.getEdad() + " QR: " + valor);
        }else{
            System.out.println("No existe usuario. QR: " + valor);
        }
    }

    @Override
    public String toString() {
        return "CodigoQR{" + "valor=" + valor + ", usuario=" + usuario + '}';
    }
}


