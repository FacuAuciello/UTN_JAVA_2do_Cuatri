
package ejercicio3;

public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;

    public Libro(String titulo, String isbn){
        this.titulo = titulo;
        this.isbn = isbn;
    }

    public Libro(String titulo, String isbn, Editorial editorial){
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }

    public Autor getAutor(){
        return autor;
    }

    public Editorial getEditorial(){
        return editorial;
    }

    @Override
    public String toString(){
        return "Libro{titulo=" + titulo + ", isbn=" + isbn + "}";
    }
}
