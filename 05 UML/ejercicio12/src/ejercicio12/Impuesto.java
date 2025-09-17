
package ejercicio12;

public class Impuesto {
    private double monto;
    private Contribuyente contribuyente;

    public Impuesto(double monto){
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setContribuyente(Contribuyente contribuyente){
        this.contribuyente = contribuyente;
    }

    public void mostrarContribuyente(){
        if(contribuyente != null){
            System.out.println(contribuyente);
        }else{
            System.out.println(contribuyente + " no existe");
        }
    }

    @Override
    public String toString() {
        return "Impuesto{" + "monto=" + monto + '}';
    }
}
