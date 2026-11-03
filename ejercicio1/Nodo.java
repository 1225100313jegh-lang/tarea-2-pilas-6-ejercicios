package pilas_edu.ejercicio1;

/*
* Cada nodo guarda una placa y apunta al siguiente nodo de la pila.
*autor Juan Eduardo González Hernández
*/
public class Nodo<T> {
    // Guardamos el dato del auto
    private final T dato;
    // Enlazamos este nodo con el que está debajo en la pila
    private Nodo<T> siguiente;

    // Creamos el nodo con el dato que recibimos
    public Nodo(T dato) {
        this.dato = dato;
    }

    // Regresamos el dato guardado en el nodo
    public T getDato() {
        return dato;
    }

    // Regresamos el nodo que sigue
    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    // Cambiamos el nodo que sigue
    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}
