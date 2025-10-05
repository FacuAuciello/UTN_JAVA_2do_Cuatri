package ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial("Java", 50);

        System.out.println("Estado inicial de la nave");
        nave.mostrarEstado();

        nave.avanzar(10);              
        nave.despegar();               
        nave.avanzar(30);              
        nave.recargarCombustible(5);   
        nave.recargarCombustible(100); 
        
        System.out.println("Estado final de la nave");
        nave.mostrarEstado();
    }
}

class NaveEspacial {
    private String nombre;
    private int combustible;

    
    private static final int COMBUSTIBLE_MAXIMO = 50;   
    private static final int COSTO_DESPEGUE = 10;       
    private static final int CONSUMO_POR_DISTANCIA = 1; 

    
    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        
        if (combustibleInicial < 0) {
            this.combustible = 0;
        } else if (combustibleInicial > COMBUSTIBLE_MAXIMO) {
            this.combustible = COMBUSTIBLE_MAXIMO;
        } else {
            this.combustible = combustibleInicial;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getCombustible() {
        return combustible;
    }

  
    public void despegar() {
        if (combustible < COSTO_DESPEGUE) {
            System.out.println("No hay combustible suficiente para despegar. Se necesitan " + COSTO_DESPEGUE);
            return;
        }
        combustible = combustible - COSTO_DESPEGUE;
        System.out.println("Despegando... Combustible restante: " + combustible);
    }

    public void avanzar(int distancia) {
        if (distancia <= 0) {
            System.out.println("La distancia debe ser mayor que 0.");
            return;
        }
        
        int consumo = distancia * CONSUMO_POR_DISTANCIA;
        
        if (consumo > combustible) {
            System.out.println("No alcanza el combustible para avanzar " + distancia + ". Disponible: " + combustible);
            return;
        }
        combustible = combustible - consumo;
        System.out.println("Avanzando " + distancia + " unidades. Combustible: " + combustible);
    }

    
    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a recargar debe ser mayor que 0.");
            return;
        }
        
        combustible = combustible + cantidad;
        
        if (combustible > COMBUSTIBLE_MAXIMO) {
            combustible = COMBUSTIBLE_MAXIMO;
            System.out.println("Tanque lleno: " + COMBUSTIBLE_MAXIMO);
        } else {
            System.out.println("Se cargaron " + cantidad + " unidades. Combustible: " + combustible);
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible: " + combustible);
        System.out.println("Combustible maximo: " + COMBUSTIBLE_MAXIMO);
    }
}

