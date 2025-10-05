
package ejercicio6;

public class Ejercicio6 {

    public static void main(String[] args) {
        Reserva r1 = new Reserva("20/09/2025", "21:00hs");
        Cliente c1 = new Cliente("Pedro", "223489650");
        r1.setCliente(c1);

        Mesa m10 = new Mesa(10, "4 personas");
        Reserva r2 = new Reserva("21/09/2025", "20:30hs", m10);
        Cliente c2 = new Cliente("Ana", "2234889021");
        r2.setCliente(c2);

        System.out.println(r1);
        System.out.println(r2);
    }
   }
    
