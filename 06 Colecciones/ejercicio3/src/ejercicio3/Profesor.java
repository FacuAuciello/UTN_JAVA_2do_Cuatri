
package ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private final List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void agregarCurso(Curso curso){
        if (curso == null) return;
        if (!cursos.contains(curso)) {
                cursos.add(curso);
        }
        if (curso.getProfesor() != this){
            curso.setProfesor(this);
        }
    }

    public void eliminarCurso(Curso curso){
        if (cursos.remove(curso) && curso.getProfesor() == this){
            curso.setProfesor(null);
        }
    }

    public List<Curso> getCursos() {
        return Collections.unmodifiableList(cursos);
    }

}