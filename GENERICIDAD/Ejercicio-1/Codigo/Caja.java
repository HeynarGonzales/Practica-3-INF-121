package Ejercicio1;

// Clase gen�rica Caja
public class Caja<T> {
    private T contenido;

    // M�todo para guardar un objeto en la caja
    public void guardar(T objeto) {
        this.contenido = objeto;
    }

    // M�todo para obtener el objeto de la caja
    public T obtener() {
        return contenido;
    }
}