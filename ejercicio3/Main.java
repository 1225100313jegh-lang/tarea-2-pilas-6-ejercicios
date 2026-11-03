package pilas_edu.ejercicio3;

import java.io.BufferedInputStream;
import java.io.IOException;

/*
* Problema: EasyStack
* Autor: Juan Eduardo González Hernández
* Descripción: Aplicamos las instrucciones de una pila y mostramos el tope
* cada vez que se solicita la operación Top.
*/
public class Main {
    private static final BufferedInputStream entrada =
            new BufferedInputStream(System.in);

    public static void main(String[] args) throws IOException {
        // Leemos cuántas instrucciones vamos a realizar
        int cantidadInstrucciones = siguienteInt();

        // Creamos la pila donde guardaremos los números
        Pila pila = new Pila(cantidadInstrucciones);
        StringBuilder salida = new StringBuilder();

        // Recorremos cada instrucción que se recibió
        for (int i = 0; i < cantidadInstrucciones; i++) {
            int operacion = siguienteInt();

            if (operacion == 1) {
                // Si la instrucción es Push, leemos el número y lo agregamos
                int numero = siguienteInt();
                pila.push(numero);
            } else if (operacion == 2) {
                // Si la pila tiene datos, sacamos el número que está arriba
                pila.pop();
            } else if (operacion == 3) {
                // Mostramos el número de arriba o Empty! si no hay datos
                if (pila.isEmpty()) {
                    salida.append("Empty!\n");
                } else {
                    salida.append(pila.peek()).append('\n');
                }
            }
        }

        // Imprimimos juntos los resultados de las instrucciones Top
        System.out.print(salida);
    }

    // Leemos el siguiente entero de forma rápida
    private static int siguienteInt() throws IOException {
        int caracter;

        do {
            caracter = entrada.read();
        } while (caracter <= ' ' && caracter != -1);

        int numero = 0;
        boolean negativo = false;
        if (caracter == '-') {
            negativo = true;
            caracter = entrada.read();
        }

        while (caracter > ' ') {
            numero = numero * 10 + caracter - '0';
            caracter = entrada.read();
        }

        return negativo ? -numero : numero;
    }
}
