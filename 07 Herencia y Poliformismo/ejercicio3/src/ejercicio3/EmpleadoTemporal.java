
package ejercicio3;

public class EmpleadoTemporal extends Empleado {
    private double horasTrabajadas;
    private double valorHora;

    public EmpleadoTemporal(String nombre, double sueldo, double horasTrabajadas, double valorHora) {
        super(nombre, sueldo);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        return valorHora * horasTrabajadas;
    }
}
