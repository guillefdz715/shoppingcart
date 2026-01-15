package carrito;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona un carrito de la compra.
 */
public class ShoppingCart {

    /** Lista de productos del carrito */
    private List<Producto> productos = new ArrayList<>();

    /**
     * Añade un producto al carrito.
     *
     * @param nombre nombre del producto
     * @param precio precio del producto
     * @param categoria categoría del producto
     */
    public void agregarProducto(String nombre, double precio, String categoria) {
        productos.add(new Producto(nombre, precio, categoria));
    }

    /**
     * Elimina del carrito todos los productos que tengan el nombre indicado.
     *
     * @param nombre nombre del producto a eliminar
     */
    public void eliminarProductoPorNombre(String nombre) {
        productos.removeIf(p -> p.getNombre().equalsIgnoreCase(nombre));
    }

    /**
     * Calcula el precio total de todos los productos del carrito.
     *
     * @return total del carrito
     */
    public double calcularTotal() {
        return productos.stream()
                .mapToDouble(Producto::getPrecio)
                .sum();
    }

    /**
     * Calcula el precio total de los productos de una categoría concreta.
     *
     * @param categoria categoría a buscar
     * @return total de la categoría indicada
     */
    public double calcularTotalPorCategoria(String categoria) {
        return productos.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase(categoria))
                .mapToDouble(Producto::getPrecio)
                .sum();
    }

    /**
     * Muestra por pantalla el ticket del carrito.
     */
    public void mostrarTicket() {
        System.out.println("===== CARRITO DE LA COMPRA =====");

        productos.forEach(p -> System.out.println(
                p.getNombre() + " - " + p.getPrecio() + " € (" + p.getCategoria() + ")"));

        System.out.println("--------------------------------");
        System.out.println("TOTAL: " + calcularTotal() + " €");
        System.out.println("================================");
    }

    /**
     * Método main de prueba.
     *
     * @param args argumentos del programa
     */
    public static void main(String[] args) {

        ShoppingCart carrito = new ShoppingCart();

        carrito.agregarProducto("Teclado", 25.99, "Informática");
        carrito.agregarProducto("Monitor", 199.99, "Informática");
        carrito.agregarProducto("Libro Java", 35.50, "Libros");
        carrito.agregarProducto("Ratón", 15.00, "Informática");

        carrito.mostrarTicket();
    }
}
