package ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {
        Bateria bateria = new Bateria("Lion 4000", "4000 mAh");
        Celular celular = new Celular("1217", "Samsung", "S24", bateria);
        Usuario usuario = new Usuario("Pablo", "39496889");
        
        celular.setUsuario(usuario);
        
        System.out.println("Usuario: " + usuario.getCelular());
        System.out.println("Bateria del celular: " + celular.getBateria());
    }
    
}
