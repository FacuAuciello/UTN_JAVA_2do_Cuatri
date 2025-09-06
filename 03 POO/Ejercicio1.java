
package tp3_poo;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Estudiante e = new Estudiante();
        e.nombre = "Jorge";
        e.apellido = "Flores";
        e.curso = "Tercero B";
        e.calificacion = 9;
        
        e.mostrarInfo();
        e.subirCalificacion(1);
        e.mostrarInfo();
        e.bajarCalificacion(1);
        e.mostrarInfo();
        
    }
    
}

class Estudiante {

    String nombre;
    String apellido;
    String curso;
    int calificacion;
    
    void mostrarInfo(){
        System.out.println("Nombre: " + nombre);    
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }
    
    void subirCalificacion(int puntos){
        calificacion += puntos;
    }
    
    void bajarCalificacion(int puntos){
        calificacion -= puntos;
    }
}
