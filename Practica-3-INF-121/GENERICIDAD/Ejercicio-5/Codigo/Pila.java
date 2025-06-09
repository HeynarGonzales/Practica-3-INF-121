package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Pila<T> {
    private List<T> elementos;

    // Constructor para inicializar la pila
    public Pila() {
        this.elementos = new ArrayList<>();
    }

    // M�todo para apilar un elemento
    public void apilar(T elemento) {
        elementos.add(elemento);
    }

    // M�todo para des-apilar un elemento (eliminando el �ltimo agregado)
    public T desapilar() {
        if (elementos.isEmpty()) {
            return null; // Retorna null si la pila est� vac�a
        } else {
            return elementos.remove(elementos.size() - 1);
        }
    }

    // M�todo para mostrar todos los elementos de la pila
    public void mostrarPila() {
        if (elementos.isEmpty()) {
            System.out.println("La pila est� vac�a.");
        } else {
            System.out.println("Contenido de la pila:");
            for (T elemento : elementos) {
                System.out.println(elemento);
            }
        }
    }
}
