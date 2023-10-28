/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3_cuadernodeprecios;

/**
 *
 * @author JOEL ANDIA
 */
abstract class T3_Ropa implements T3_Producto {
    private String nombre;
    private double precio;

    public T3_Ropa(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Precio: " + precio;
    }
}
