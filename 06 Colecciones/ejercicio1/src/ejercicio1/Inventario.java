
package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private final List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        if (p != null) {
            productos.add(p);
            System.out.println("Producto agregado");
        } else {
            System.out.println("No existe el producto");
        }
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id){
        for (Producto p : productos) {
            if (p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }

    public boolean eliminarProducto(String id){
        Producto p = buscarProductoPorId(id);
        if (p != null){
            return productos.remove(p);
        }
        return false;
    }

    public boolean actualizarStock(String id, int nuevaCantidad){
        Producto p = buscarProductoPorId(id);
        if (p != null){
            p.setCantidad(nuevaCantidad);
            return true;
        }
        return false;
    }

    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria){
        List<Producto> resultado = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria){
                resultado.add(p);
            }
        }
        return resultado;
    }

    public List<Producto> filtrarProductosPorPrecio(double min, double max){
        List<Producto> resultado = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max){
                resultado.add(p);
            }
        }
        return resultado;
    }

    public int obtenerTotalStock(){
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock(){
        if (productos.isEmpty()){
            return null;
        } else {
            Producto mayor = productos.get(0);
            for (Producto p : productos) {
                if (p.getCantidad() > mayor.getCantidad()){
                    mayor = p;
                }
            }
            return mayor;
        }
    }

    public void mostrarCategoriasDisponibles(){
        System.out.println("Categorias disponibles:");
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println("- " + c + ": " + c.getDescripcion());
        }
    }
}