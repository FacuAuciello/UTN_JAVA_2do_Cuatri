
package ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
    Biblioteca biblio = new Biblioteca("Arena");
    Autor a1 = new Autor("1", "Jorge Luis Borges", "Argentina");
    Autor a2 = new Autor("2", "Mario Benedetti", "Uruguay");
    Autor a3 = new Autor("3", "Pablo Neruda", "Chile");

    biblio.agregarLibro("100", "Ficciones", 1944, a1);
    biblio.agregarLibro("101", "La Biblioteca de Babel", 1941, a1);
    biblio.agregarLibro("200", "La Tregua", 1960, a2);
    biblio.agregarLibro("201", "Gracias por el Fuego", 1969, a2);
    biblio.agregarLibro("300", "Cien Sonetos de Amor", 1959, a3);


    biblio.listarLibros();
    biblio.buscarLibroPorIsbn("100");
    biblio.filtrarLibrosPorAnio(1969);
    biblio.eliminarLibro("300");
    biblio.listarLibros();
    biblio.obtenerCantidadLibros();
    biblio.mostrarAutoresDisponibles();
    }
    
}
