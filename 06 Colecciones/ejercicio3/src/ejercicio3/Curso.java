
package ejercicio3;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        if (this.profesor == profesor) return;

        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }

        this.profesor = profesor;

        if (this.profesor != null && !profesor.getCursos().contains(this)) {
            profesor.agregarCurso(this);
        }
    }

    public void mostrarInfo(){
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Profesor: " + (this.profesor != null ? this.profesor.getNombre() : "sin asignar"));
    }
}
