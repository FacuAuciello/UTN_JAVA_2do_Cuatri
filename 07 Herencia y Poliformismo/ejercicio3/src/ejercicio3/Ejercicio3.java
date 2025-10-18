

package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {

    public static void main(String[] args) {
     List<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Juan", 22000));
        empleados.add(new EmpleadoTemporal("Ana", 2500, 40, 300));
        empleados.add(new EmpleadoPlanta("Pedro", 18000));
        empleados.add(new EmpleadoTemporal("Lucia", 1800, 30, 300));

        for (Empleado empleado : empleados) {
            System.out.println("Empleado: " + empleado.getNombre());
            System.out.println("Sueldo: " + empleado.calcularSueldo());

            if (empleado instanceof EmpleadoPlanta) {
                System.out.println("Empleado de planta (sueldo fijo)");
                System.out.println("");
            } else if (empleado instanceof EmpleadoTemporal) {
                System.out.println("Empleado temporal(cobro segun horas trabajadas)");
                System.out.println("");
            }
        }
    }
}
