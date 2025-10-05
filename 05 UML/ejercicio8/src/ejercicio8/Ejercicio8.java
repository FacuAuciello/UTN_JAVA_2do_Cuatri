
package ejercicio8;

public class Ejercicio8 {

    public static void main(String[] args) {
        Documento documento = new Documento("Contrato", "Contenido");
        Usuario usuario = new Usuario("Maria", "maria@gmail.com");

        documento.getFirmaDigital().setUsuario(usuario);

        System.out.println(documento.detalle());
    }
  }
    

