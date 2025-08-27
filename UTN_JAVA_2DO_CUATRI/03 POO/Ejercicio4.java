
package ejercicio4;

public class Ejercicio4 {

    public static void main(String[] args) {
        Gallina g1 = new Gallina(1);
        Gallina g2 = new Gallina(2);
    
    
        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();
        
        g2.envejecer();
        g2.envejecer();
        g2.ponerHuevo();
        
        g1.mostrarEstado();
        g2.mostrarEstado();
    
    
    }
    
   
}

class Gallina{
    
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    public Gallina(int idGallina){
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }
    
    public int getIdGallina(){
        return idGallina;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public int getHuevosPuestos(){
        return huevosPuestos;
    }
    
    public void envejecer(){
        edad++;
    }
    
    public void ponerHuevo(){
        huevosPuestos++;
    }
    
    public void mostrarEstado(){
        System.out.println("Gallina: " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos puestos: " + huevosPuestos);
    }
}
