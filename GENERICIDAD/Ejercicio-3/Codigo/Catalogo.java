package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Catalogo<T> {
    private List<T> elementos;

    // Constructor para inicializar la lista
    public Catalogo() {
        this.elementos = new ArrayList<>();
    }

    // M�todo para agregar un elemento al cat�logo
    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    // M�todo para buscar un elemento en el cat�logo
    public T buscar(int indice) {
        if (indice >= 0 && indice < elementos.size()) {
            return elementos.get(indice);
        } else {
            return null; // Retorna null si el �ndice no es v�lido
        }
    }
}

