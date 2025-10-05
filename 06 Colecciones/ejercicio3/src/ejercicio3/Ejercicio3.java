
package ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
       Profesor p1 = new Profesor("1", "Juan", "Ingles");
    Profesor p2 = new Profesor("2", "Carlos", "Bases de Datos");
    Profesor p3 = new Profesor("3", "Pedro", "Programacion");

    Curso c1 = new Curso("10", "Ingles para principiantes");
    Curso c2 = new Curso("11", "Bases de datos para principiantes");
    Curso c3 = new Curso("12", "Programacion para principiantes");
    Curso c4 = new Curso("13", "Bases de datos avanzado");
    Curso c5 = new Curso("14", "Programacion avanzado");

    Universidad uni = new Universidad("UTN");

    uni.agregarProfesor(p1);
    uni.agregarProfesor(p2);
    uni.agregarProfesor(p3);

    uni.agregarCurso(c1);
    uni.agregarCurso(c2);
    uni.agregarCurso(c3);

    uni.asignarProfesorACurso("10", "1");
    uni.asignarProfesorACurso("11", "2");
    uni.asignarProfesorACurso("12", "3");

    System.out.println("Cursos con profesor: ");
    c1.mostrarInfo();
    System.out.println("");
    c2.mostrarInfo();
    System.out.println("");
    c3.mostrarInfo();

    System.out.println("Profesores con cursos: ");
    System.out.println(p1.getNombre());
    for (Curso c : p1.getCursos()) System.out.println(c.getNombre());
    System.out.println("");
    System.out.println(p2.getNombre());
    for (Curso c : p2.getCursos()) System.out.println(c.getNombre());
    System.out.println("");
    System.out.println(p3.getNombre());
    for (Curso c : p3.getCursos()) System.out.println(c.getNombre());
    System.out.println("");

    boolean cambioProfe = uni.asignarProfesorACurso("11", "3");
    System.out.println("Cambiando profesor: " + cambioProfe);
    c2.mostrarInfo();

    System.out.println("");
    System.out.println("cursos de " + p2.getNombre() + " :" );
    for (Curso c : p2.getCursos()) System.out.println(c.getCodigo() + " " + c.getNombre());
    System.out.println("cursos de " + p3.getNombre() + " :");
    for (Curso c : p3.getCursos()) System.out.println(c.getCodigo() + " " + c.getNombre());

    System.out.println("");
    System.out.println("Eliminar curso 12 ");
    boolean elimCurso = uni.eliminarCurso("12");
    System.out.println("Eliminado: " + elimCurso);

    System.out.println("");
    System.out.println("cursos de " + p3.getNombre() + " despues de eliminar:");
    for (Curso c : p3.getCursos()) System.out.println(c.getCodigo() + " " + c.getNombre());

    System.out.println("");
    System.out.println("Eliminar profesor 1");
    boolean elimProf = uni.eliminarProfesor("1");
    System.out.println("eliminado: " + elimProf);

    System.out.println("");
    System.out.println("curso 10 ahora:");
    c1.mostrarInfo();

    System.out.println("");
    System.out.println("Reporte: cantidad de cursos por profesor");
    System.out.println(p1.getNombre() + ": " + p1.getCursos().size());
    System.out.println(p2.getNombre() + ": " + p2.getCursos().size());
    System.out.println(p3.getNombre() + ": " + p3.getCursos().size());
    }
    
}
