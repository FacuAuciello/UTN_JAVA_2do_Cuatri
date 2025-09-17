
package ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {
        Libro libro1 = new Libro("Harry Potter", "1234567");
        Autor autor1 = new Autor("J.K Rowling", "Reino Unido");
        
        
        libro1.setAutor(autor1);
        
        System.out.println("Autor del libro1: " + libro1.getAutor());

        Editorial editorial = new Editorial("Bloomsbury", "Londres");
        Libro libro2 = new Libro("Clean Code", "9780132350884", editorial);
        Autor autor2 = new Autor("Robert C. Martin", "Estados Unidos");
        
        libro2.setAutor(autor2);
        
        System.out.println("Autor del libro2: " + libro2.getAutor());
        System.out.println("Editorial del libro2: " + libro2.getEditorial());
    }
    
}
