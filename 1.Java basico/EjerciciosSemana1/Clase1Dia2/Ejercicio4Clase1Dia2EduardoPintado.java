import java.util.Scanner;
public class Ejercicio4Clase1Dia2EduardoPintado {

        public static void main(String[] args) {
            // Creamos un objeto Scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in);

            // Pedimos al usuario que ingrese dos numeros enteros
            System.out.print("Ingresa el primer numero entero: ");
            int numero1 = scanner.nextInt();
            System.out.print("Ingresa el segundo numero entero: ");
            int numero2 = scanner.nextInt();

            // Realizamos las operaciones aritmeticas
            int suma = numero1 + numero2;
            int resta = numero1 - numero2;
            int multiplicacion = numero1 * numero2;
            double division1 = 0;
            double division2 = 0;

            // Manejamos la division por cero
            if (numero2 != 0) {
                division1 = (double) numero1 / numero2;
            }

            if (numero1 != 0) {
                division2 = (double) numero2 / numero1;
            }

            // Mostramos los resultados por pantalla
            System.out.println("Resultados de las operaciones:");
            System.out.println("Suma: " + numero1 + " + " + numero2 + " = " + suma);
            System.out.println("Resta: " + numero1 + " - " + numero2 + " = " + resta);
            System.out.println("Multiplicacion: " + numero1 + " * " + numero2 + " = " + multiplicacion);
            if (numero2 != 0) {
                System.out.println("Division: " + numero1 + " / " + numero2 + " = " + division1);
            } else {
                System.out.println("Division: No se puede dividir por cero.");
            }

            if (numero1 != 0) {
                System.out.println("Division: " + numero2 + " / " + numero1 + " = " + division2);
            } else {
                System.out.println("Division: No se puede dividir por cero.");
            }

            // Cerramos el Scanner para evitar fugas de recursos
            scanner.close();
        }
    }


