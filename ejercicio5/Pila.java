package pilas_edu.ejercicio5;

/*
* Autor: Juan Eduardo González Hernández
* Guardamos los números en un arreglo y usamos el tope para saber
* cuántos papeles hay en la pila.
*/
public class Pila {
    // Arreglo donde guardamos los teléfonos
    private int[] datos;
    // El tope indica cuántos datos se han agregado
    private int tope;

    // Creamos el arreglo con espacio para todos los teléfonos
    public Pila(int capacidad) {
        datos = new int[capacidad];
        tope = 0;
    }

    // Agregamos el teléfono en la siguiente posición libre
    public void push(int dato) {
        datos[tope] = dato;
        tope++;
    }

    // Sacamos el teléfono que se encuentra hasta arriba
    public void pop() {
        if (!isEmpty()) {
            tope--;
            datos[tope] = 0;
        }
    }

    // Consultamos el teléfono de arriba sin sacarlo
    public int peek() {
        return datos[tope - 1];
    }

    // Revisamos si la pila está vacía
    public boolean isEmpty() {
        return tope == 0;
    }
}
