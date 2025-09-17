
package ejercicio9;

public class Ejercicio9 {

    public static void main(String[] args) {
        Paciente paciente = new Paciente("Laura", "OSDE");
        Profesional profesional = new Profesional("Dr Gomez", "Clinica");
        CitaMedica cita = new CitaMedica("22/09/2025", "09:30hs");

        cita.setPaciente(paciente);
        cita.setProfesional(profesional);

        System.out.println(cita.detalle());
    }
    }
    

