import java.util.Scanner;

public class Ejercicio3Clase1Dia2EduardoPintado {

        public static void main(String[] args) {
            // Declaramos variables para la base y la altura del triángulo
            double base, altura;

            // Creamos un objeto Scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in);

            // Solicitamos al usuario que ingrese la base del triangulo
            System.out.print("Ingresa la longitud de la base del triangulo: ");
            base = scanner.nextDouble();

            // Solicitamos al usuario que ingrese la altura del triangulo
            System.out.print("Ingresa la altura del triangulo: ");
            altura = scanner.nextDouble();

            // Calculamos el área del triangulo utilizando la fórmula (base * altura) / 2
            double area = (base * altura) / 2;

            // Mostramos el resultado por pantalla
            System.out.println("El area del triangulo es: " + area);

            // Cerramos el Scanner para evitar fugas de recursos
            scanner.close();
        }
    }


