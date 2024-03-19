
import java.util.Scanner;

public class Ejercicio1Clase2Dia3  {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese su edad
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Determinamos si la persona puede ingresar al recital
        if (edad >= 18) {
            System.out.println("Bienvenido/a al recital. ¡Disfruta del evento!");
        } else {
            System.out.println("Lo sentimos, el ingreso al recital está permitido únicamente para mayores de 18 años.");
        }

        // Cerramos el Scanner
        scanner.close();
    }
}
