
package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }

    public void listarLibros() {
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                libro.mostrarInfo();
                return libro;
            }
        }
        return null;
    }

    public boolean eliminarLibro(String isbn) {
        Libro li = buscarLibroPorIsbn(isbn);
        if (li != null) {
            return libros.remove(li);
        }
        return false;
    }

    public void obtenerCantidadLibros() {
        System.out.println("Cantidad de libros: " + libros.size());
    }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> filtrar = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                filtrar.add(libro);
                libro.mostrarInfo();
            }
        }
        return filtrar;
    }

    public void mostrarAutoresDisponibles() {
        for (Libro libro : libros) {
            System.out.println(libro.getAutor());
        }
    }

}