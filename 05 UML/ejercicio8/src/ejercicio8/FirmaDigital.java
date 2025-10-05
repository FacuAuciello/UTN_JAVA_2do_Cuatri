
package ejercicio8;

public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario;

    public FirmaDigital(String codigoHash, String fecha){
        this.codigoHash = codigoHash;
        this.fecha = fecha;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    @Override
    public String toString(){
        
        return "FirmaDigital{codigoHash=" + codigoHash + ", fecha=" + fecha + ", usuario=" + usuario + "}";
    }
}
