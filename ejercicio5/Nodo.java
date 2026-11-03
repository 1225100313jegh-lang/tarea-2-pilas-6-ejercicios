package pilas_edu.ejercicio5;

/*
* Autor: Juan Eduardo González Hernández
* Este nodo guarda un teléfono y apunta al siguiente nodo.
* En este ejercicio la pila usa un arreglo y no ocupa esta clase.
*/
public class Nodo {
    // Teléfono guardado en el nodo
    private final int dato;
    // Enlace al siguiente nodo
    private Nodo siguiente;

    // Creamos el nodo con el teléfono recibido
    public Nodo(int dato) {
        this.dato = dato;
    }

    // Regresamos el teléfono guardado
    public int getDato() {
        return dato;
    }

    // Regresamos el siguiente nodo
    public Nodo getSiguiente() {
        return siguiente;
    }

    // Cambiamos el siguiente nodo
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
