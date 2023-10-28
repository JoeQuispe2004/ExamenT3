/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3_cuadernodeprecios;

/**
 *
 * @author JOEL ANDIA
 */
class T3_Tienda {
    private T3_Producto[] catalogo;

    public T3_Tienda(T3_Producto[] catalogo) {
        this.catalogo = catalogo;
    }

    public void mostrarCatalogo() {
        System.out.println("Catalogo de la tienda:");
        for (T3_Producto producto : catalogo) {
            System.out.println(producto);
        }
        
    }

    public void actualizarPrecio(String nombre, double nuevoPrecio) {
        for (T3_Producto producto : catalogo) {
            if (producto.getNombre().equals(nombre)) {
                producto.setPrecio(nuevoPrecio);
                System.out.println("Precio de " + nombre + " actualizado a " + nuevoPrecio);
                return;
            }
        }
        System.out.println("Producto no encontrado en el catalogo.");
    }
}
