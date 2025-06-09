package Ejercicio3;
/*
Crea una clase gen�rica Catalogo<T> que almacene productos o libros.
a) Agrega m�todos para agregar y buscar elemento
b) Prueba el cat�logo con libros
c) Prueba el cat�logo con productos
*/
public class Main {
    public static void main(String[] args) {
        // Crear un cat�logo para libros
        Catalogo<Libro> catalogoDeLibros = new Catalogo<>();
        catalogoDeLibros.agregar(new Libro("Cien a�os de soledad", "Heynar Alan Gonzales"));
        catalogoDeLibros.agregar(new Libro("Don Quijote de la Mancha", "Gabriela Fernandez Cortez"));

        // Crear un cat�logo para productos
        Catalogo<Producto> catalogoDeProductos = new Catalogo<>();
        catalogoDeProductos.agregar(new Producto("Laptop", 1200.99));
        catalogoDeProductos.agregar(new Producto("Camiseta", 19.99));

        // Buscar y mostrar libros
        System.out.println("Buscar libro en �ndice 0: " + catalogoDeLibros.buscar(0));
        System.out.println("Buscar libro en �ndice 1: " + catalogoDeLibros.buscar(1));

        // Buscar y mostrar productos
        System.out.println("Buscar producto en �ndice 0: " + catalogoDeProductos.buscar(0));
        System.out.println("Buscar producto en �ndice 1: " + catalogoDeProductos.buscar(1));
    }
}
