import java.util.Scanner;

public class Ejercicio4Clase2Dia3 {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Creamos una matriz para representar el mapa de asientos del teatro
        char[][] asientos = new char[5][5];

        // Inicializamos todos los asientos como vacíos ("O")
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = 'O';
            }
        }

        // Mostramos el mapa de asientos inicial
        mostrarMapaAsientos(asientos);

        // Permitimos al usuario reservar asientos hasta que decida finalizar
        boolean finalizado = false;
        while (!finalizado) {
            // Pedimos al usuario que ingrese la fila y el número de asiento deseado
            System.out.print("Ingrese la fila del asiento (1-5): ");
            int fila = scanner.nextInt() - 1; // Restamos 1 para que coincida con el índice de la matriz

            System.out.print("Ingrese el número de asiento (1-5): ");
            int numeroAsiento = scanner.nextInt() - 1; // Restamos 1 para que coincida con el índice de la matriz

            // Verificamos si el asiento seleccionado está disponible
            if (asientos[fila][numeroAsiento] == 'O') {
                // Marcamos el asiento como ocupado
                asientos[fila][numeroAsiento] = 'X';
                System.out.println("¡Reserva exitosa!");
            } else {
                System.out.println("Lo sentimos, ese asiento ya está ocupado. Por favor, elija otro.");
            }

            // Mostramos el mapa de asientos actualizado
            mostrarMapaAsientos(asientos);

            // Preguntamos al usuario si desea realizar otra reserva
            System.out.print("¿Desea realizar otra reserva? (Si/No): ");
            String continuar = scanner.next();
            if (!continuar.equalsIgnoreCase("Si")) {
                finalizado = true;
            }
        }

        // Cerramos el Scanner
        scanner.close();
    }

    // Método para mostrar el mapa de asientos
    public static void mostrarMapaAsientos(char[][] asientos) {
        System.out.println("Mapa de asientos:");
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[i][j] + " ");
            }
            System.out.println(); // Saltar a la siguiente fila después de imprimir una fila completa de asientos
        }
        System.out.println(); // Agregar una línea en blanco al final
    }
}
