
package ejercicio10;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo){
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad("1234", "15/09/2025");
    }

    public void setTitular(Titular titular){
        this.titular = titular;
        if (titular != null && titular.getCuenta() != this){
            titular.setCuenta(this);
        }
    }

    public Titular getTitular(){
        return titular;
    }

    public void mostrarClave(){
        System.out.println(claveSeguridad);
    }

    @Override
    public String toString(){
        
        return "CuentaBancaria{cbu=" + cbu + ", saldo=" + saldo + ", claveSeguridad=" + claveSeguridad + ", titular=" + titular + "}";
    }
}
