import java.util.Scanner;
public class Ejercicio1Clase1Dia2EduardoPintado {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        //Mostramos el mensaje de bienvenida
        System.out.println("Hola, bienvenido al sistema");
        // Pedimos al usuario que ingrese su nombre
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        // Mostramos un mensaje de bienvenida con el nombre del usuario
        System.out.println("Hola " + nombre + ", bienvenido al sistema.");

        // Cerramos el Scanner para evitar fugas de recursos
        scanner.close();
    }
}


