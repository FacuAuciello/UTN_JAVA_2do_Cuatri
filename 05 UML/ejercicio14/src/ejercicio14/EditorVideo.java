
package ejercicio14;

public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto){
        Render render = new Render(formato, proyecto);
        System.out.println("Render generado: " + render);
        System.out.println("Proyecto del render: " + render.getProyecto());
    }
}
