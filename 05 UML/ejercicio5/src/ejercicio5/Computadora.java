
package ejercicio5;

public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String modelo, String chipset){
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modelo, chipset);
    }

    public void setPropietario(Propietario propietario){
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this){
            propietario.setComputadora(this);
        }
    }

    public Propietario getPropietario(){
        return propietario;
    }

    public PlacaMadre getPlacaMadre(){
        return placaMadre;
    }

    @Override
    public String toString(){
        
        return "Computadora{marca=" + marca + ", numeroSerie=" + numeroSerie + "}";
    }
}
