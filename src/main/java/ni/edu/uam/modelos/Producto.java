package ni.edu.uam.modelos;

import java.util.ArrayList;

/*Crear un programa que permita almacenar productos en un ArrayList y mostrar cuántos productos hay registrados.*/
public class Producto {
    ArrayList<String> productos = new ArrayList<String>();
    public Producto() {
        productos.add("Celular");
        productos.add("Pollo");
        productos.add("Camioneta");
    }
    public void mostrarCantidadProductos() {
        System.out.println("Cantidad de productos: " + productos.size());
    }
}
