
package ejercicio9;

public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(String fecha, String hora){
        this.fecha = fecha;
        this.hora = hora;
    }

    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }

    public void setProfesional(Profesional profesional){
        this.profesional = profesional;
    }

    public String detalle(){
        
        return "CitaMedica{fecha=" + fecha + ", hora=" + hora + "} " + paciente + ", " + profesional;
    }

    @Override
    public String toString(){
        
        return "CitaMedica{fecha=" + fecha + ", hora=" + hora + "}";
    }
}
