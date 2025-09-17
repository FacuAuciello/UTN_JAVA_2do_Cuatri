
package ejercicio7;

public class Ejercicio7 {

    public static void main(String[] args) {
        Motor motor = new Motor("Nafta", "MTR-8899");
        Vehiculo vehiculo = new Vehiculo("AA123NN", "Focus", motor);
        Conductor conductor = new Conductor("Diego Perez", "B1234567");

        vehiculo.setConductor(conductor);

        System.out.println("Vehiculo y conductor: " + conductor.getVehiculo());
    }
    }
    

