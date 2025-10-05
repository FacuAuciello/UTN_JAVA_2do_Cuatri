
package tp_4_poo;

public class Tp_4_POO {

   
    public static void main(String[] args) {
        
    Empleado e1 = new Empleado(1 , "Felipe", "Gerente", 1500);

    Empleado e2 = new Empleado("Carlos", "Vendedor");

    e1.actualizarSalario(20);
    e2.actualizarSalarioMonto(300);

    System.out.println(e1);
    System.out.println(e2);
    System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
    }
    
}
class Empleado{
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    private static int totalEmpleados = 0;
    private static int aumentoId = 2;

    Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    Empleado(String nombre, String puesto) {
        this.id = siguienteId();
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000;
        totalEmpleados++;
    }

    private static int siguienteId() {
        return aumentoId++;
    }

    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if (salario < 0) {
            System.out.println("El salario no puede ser negativo");
            return;
        }
            this.salario = salario;
    }

    public void actualizarSalario(double porcentaje) {
        double cuenta = salario += salario * (porcentaje / 100);
        setSalario(cuenta);
    }
    public void actualizarSalarioMonto(double monto){
       double actualizando = salario = salario + monto;
        setSalario(actualizando);
    }

    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }

    @Override
    public String toString() {
        return "ID:= " + id + ", Nombre:= " + nombre + ", Puesto:= " + puesto + ", Salario:= " + salario;
    }
}