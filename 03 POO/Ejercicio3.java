
package ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {
        Libro li = new Libro();
         li.setTitulo("La Felicidad");
         li.setAutor("Gabriel Rolon");
         
         li.setAnioPublicacion(2999);
         li.setAnioPublicacion(2023);
         
         li.mostrarInfo();
                
    }
    
    
}

class Libro{
       private String titulo;
       private String autor;
       private int anioPublicacion;

    public String getTitulo(){
        return titulo;
}    
    public String getAutor(){
        return autor;
    }
    
    public int getAnioPublicacion(){
        return anioPublicacion;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public void setAnioPublicacion(int anio){
        int anioActual = 2025;
        if (anio > 0 && anio <= anioActual) {
            this.anioPublicacion = anio;
        } else {
            
        }
    }
    
    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Anio de publicacion: " + anioPublicacion);
    }
}



