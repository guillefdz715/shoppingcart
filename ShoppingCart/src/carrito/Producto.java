package carrito;

/**
 * Clase que representa un producto del carrito.
 */
public class Producto {

    private String nombre;
    private double precio;
    private String categoria;

    /**
     * Constructor de la clase Producto.
     *
     * @param nombre nombre del producto
     * @param precio precio del producto
     * @param categoria categoría del producto
     */
    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    /**
     * Devuelve el nombre del producto.
     *
     * @return nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el precio del producto.
     *
     * @return precio del producto
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Devuelve la categoría del producto.
     *
     * @return categoría del producto
     */
    public String getCategoria() {
        return categoria;
    }
}