
package ejercicio14;

public class Ejercicio14 {

    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Trailer", 2);
        EditorVideo editor = new EditorVideo();

        editor.exportar("MP4", proyecto);
    }
    
}
