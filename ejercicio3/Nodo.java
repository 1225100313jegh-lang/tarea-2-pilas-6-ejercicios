package pilas_edu.ejercicio3;

/*
* Autor: Juan Eduardo González Hernández
* Cada nodo guarda un número y apunta al que está debajo en la pila.
*/
public class Nodo {
    // Guardamos el número del nodo
    private final int dato;
    // Enlazamos este nodo con el que sigue
    private Nodo siguiente;

    // Creamos el nodo con el número recibido
    public Nodo(int dato) {
        this.dato = dato;
    }

    // Regresamos el número guardado
    public int getDato() {
        return dato;
    }

    // Regresamos el siguiente nodo
    public Nodo getSiguiente() {
        return siguiente;
    }

    // Cambiamos el nodo que sigue
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
