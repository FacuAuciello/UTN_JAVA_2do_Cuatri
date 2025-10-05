
package ejercicio11;

public class Ejercicio11 {

    public static void main(String[] args) {
        Cancion cancion = new Cancion("Gasolina");
        Artista artista = new Artista("Daddy Yankee", "Reggaeton");

        cancion.setArtista(artista);
        cancion.mostrarArtista();

        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);
        
    }
    
}
