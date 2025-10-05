
package ejercicio11;

public class Cancion {
    private String titulo;
    private Artista artista;

    public Cancion(String titulo) {
        this.titulo = titulo;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public void mostrarArtista(){
        if(artista != null){
            System.out.println("Cancion: " + titulo + ", Artista: " + artista.getNombre() + ", Genero: " + artista.getGenero());
        }
    }
  }

