
package ejercicio3;

public class EmpleadoPlanta extends Empleado {
    public EmpleadoPlanta(String nombre, double sueldo) {
        super(nombre, sueldo);
    }

    @Override
    public double calcularSueldo() {
        return sueldo;
    }
}
