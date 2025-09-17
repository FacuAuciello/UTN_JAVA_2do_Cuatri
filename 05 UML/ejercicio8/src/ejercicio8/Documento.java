
package ejercicio8;

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;

    public Documento(String titulo, String contenido){
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital("abc123", "20/09/2025");
    }

    public FirmaDigital getFirmaDigital(){
        return firmaDigital;
    }

    public String detalle(){
        
        return "Documento{titulo=" + titulo + "} FirmaDigital=" + firmaDigital;
    }

    @Override
    public String toString(){
        
        return "Documento{titulo=" + titulo + ", contenido=" + contenido + "}";
    }
}
