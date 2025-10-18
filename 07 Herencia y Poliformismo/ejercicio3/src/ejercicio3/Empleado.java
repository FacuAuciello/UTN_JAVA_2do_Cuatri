
package ejercicio3;

public abstract class Empleado {
    private String nombre;
    double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }


    public abstract double calcularSueldo();
}
