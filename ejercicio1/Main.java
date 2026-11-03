package pilas_edu.ejercicio1;
import java.util.Scanner;

/*
* Problema: Atestamiento del callejón
* Descripción: Recibimos las placas de los autos en el orden en que llegaron
* y usamos una pila para sacar los autos hasta encontrar el que fue solicitado.
*autor Juan Eduardo González Hernández
*/
public class Main {
    public static void main(String[] args) {
        // Creamos el Scanner para leer la cantidad de autos y sus placas
        Scanner entrada = new Scanner(System.in);
        int cantidadAutos = entrada.nextInt();

        // Creamos la pila donde guardaremos los autos del callejón
        Pila<String> callejon = new Pila<>();
        for (int i = 0; i < cantidadAutos; i++) {
            String placa = entrada.next();
            // Revisamos que la placa no tenga más de 7 dígitos
            if (placa.length() > 7) {
                System.err.println("La placa debe tener máximo 7 dígitos.");
                return;
            }
            // Agregamos cada auto en el orden en que llegó
            callejon.push(placa);
        }

        // Leemos la placa del auto que se necesita entregar
        String placaSolicitada = entrada.next();
        if (placaSolicitada.length() > 7) {
            System.err.println("La placa debe tener máximo 7 dígitos.");
            return;
        }

        // Contamos los autos que salen hasta llegar al auto solicitado
        int autosRetirados = 0;
        while (!callejon.isEmpty()) {
            // El último auto que llegó es el primero que puede salir
            String placaEnLaSalida = callejon.pop();
            autosRetirados++;

            if (placaEnLaSalida.equals(placaSolicitada)) {
                // Imprimimos cuántos autos se tuvieron que sacar
                System.out.println(autosRetirados);
                return;
            }
        }

        // Si se vació la pila, significa que la placa no estaba estacionada
        System.out.println("No existe el auto");
    }
}
