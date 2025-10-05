
package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private final List<Profesor> profesores = new ArrayList<>();
    private final List<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public void listarProfesores(){
        for (Profesor profesor : profesores) {
            System.out.println(profesor.getNombre());
        }
    }

    public void listarCursos(){
        for (Curso curso : cursos) {
            System.out.println(curso.getNombre());
        }
    }

    public void agregarProfesor(Profesor profesor) {
        if (profesor != null && !profesores.contains(profesor)) {
            profesores.add(profesor);
        }
    }

    public void agregarCurso(Curso curso) {
        if (curso != null && !cursos.contains(curso)) {
            cursos.add(curso);
        }
    }
    public Profesor buscarProfesoresPorId(String id) {
        if (id == null) return null;
        for (Profesor profesor : profesores) {
            if (profesor.getId().equals(id))
                return profesor;
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        if (codigo == null) return null;
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo))
                return curso;
        }
        return null;
    }

    public boolean asignarProfesorACurso(String codigoCurso, String idProfesor) {
       Curso curso = buscarCursoPorCodigo(codigoCurso);
       Profesor profesor = buscarProfesoresPorId(idProfesor);
       if (curso == null || profesor == null ) return false;
       curso.setProfesor(profesor);
       return true;
    }

    public boolean eliminarCurso(String codigoCurso) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        if (curso == null) return false;
        if (curso.getProfesor() == null) return false;
        curso.setProfesor(null);
        return cursos.remove(curso);
    }

    public boolean eliminarProfesor(String idProfesor){
        Profesor profesor = buscarProfesoresPorId(idProfesor);
        List<Curso> curso1 = new ArrayList<>(profesor.getCursos());
        for (Curso curso : curso1) {
            curso.setProfesor(null);
        }
        return profesores.remove(profesor);
    }
}



