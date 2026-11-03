package pilas_edu.ejercicio3;

/*
* Autor: Juan Eduardo González Hernández
* Creamos una pila con un arreglo donde el último dato que entra
* es el primero que sale.
*/
public class Pila {
    // Guardamos los números de la pila en un arreglo
    private int[] datos;
    // El tope indica cuántos números hay guardados
    private int tope;

    // Creamos el arreglo con espacio para todas las instrucciones
    public Pila(int capacidad) {
        datos = new int[capacidad];
        tope = 0;
    }

    // Guardamos el dato en la siguiente posición libre y avanzamos el tope
    public void push(int dato) {
        datos[tope] = dato;
        tope++;
    }

    // Retrocedemos el tope para sacar el último dato agregado
    public void pop() {
        if (!isEmpty()) {
            tope--;
            datos[tope] = 0;
        }
    }

    // Consultamos el número del tope sin sacarlo
    public int peek() {
        return datos[tope - 1];
    }

    // Revisamos si la pila está vacía
    public boolean isEmpty() {
        return tope == 0;
    }
}
