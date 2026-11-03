package pilas_edu.ejercicio1;
import java.util.EmptyStackException;

/*
* Creamos una pila genérica enlazada donde el último dato que entra
* es el primero que sale.
*autor Juan Eduardo González Hernández
*/
public class Pila<T> {
    // El tope señala al último nodo que se agregó a la pila
    private Nodo<T> tope;
    // Guardamos cuántos elementos hay en la pila
    private int tamanio;

    // Agregamos un dato nuevo en el tope
    public void push(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        nuevo.setSiguiente(tope);
        tope = nuevo;
        tamanio++;
    }

    // Sacamos y regresamos el dato que está en el tope
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T dato = tope.getDato();
        tope = tope.getSiguiente();
        tamanio--;
        return dato;
    }

    // Consultamos el dato del tope sin sacarlo
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return tope.getDato();
    }

    // Revisamos si no hay elementos en la pila
    public boolean isEmpty() {
        return tope == null;
    }

    // Regresamos la cantidad de elementos guardados
    public int size() {
        return tamanio;
    }
}
