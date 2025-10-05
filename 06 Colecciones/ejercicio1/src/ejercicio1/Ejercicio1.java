
package ejercicio1;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        Producto p1 = new Producto("A101", "Chocolinas", 2000.0, 30, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("B322", "Parlante", 45000.0, 12, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("C433", "Remera", 30000.0, 25, CategoriaProducto.ROPA);
        Producto p4 = new Producto("D987", "Colchon", 100000.0, 8, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("E541", "Teclado", 65000.0, 15, CategoriaProducto.ELECTRONICA);

        inv.agregarProducto(p1);
        inv.agregarProducto(p2);
        inv.agregarProducto(p3);
        inv.agregarProducto(p4);
        inv.agregarProducto(p5);

        System.out.println("------LISTADO COMPLETO---------");
        inv.listarProductos();

        System.out.println("");

        System.out.println("-----------BUSCAR-------------");
        Producto buscado = inv.buscarProductoPorId("A101");
        if (buscado != null) buscado.mostrarInfo();

        System.out.println("");

        System.out.println("---------FILTRO: ELECTRONICA---------");
        List<Producto> electronica = inv.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        for (Producto p : electronica) p.mostrarInfo();

        System.out.println("");

        inv.actualizarStock("A101", 40);
        System.out.println("--------Total de unidades en stock----------: " + inv.obtenerTotalStock());

        System.out.println("");

        Producto mayor = inv.obtenerProductoConMayorStock();
        System.out.println("--------MAYOR STOCK---------");
        if (mayor != null) mayor.mostrarInfo();

        System.out.println("");

        System.out.println("---------PRECIO ENTRE 1000 Y 10000--------");
        for (Producto p : inv.filtrarProductosPorPrecio(1000, 10000)) {
            p.mostrarInfo();
        }

        System.out.println("");

        inv.mostrarCategoriasDisponibles();

    }
}
    

