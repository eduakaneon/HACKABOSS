import java.util.Scanner;

public class Ejercicio3Clase2Dia3  {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Creamos un vector para almacenar las temperaturas máximas de la última semana
        double[] temperaturas = new double[7];

        // Solicitamos al usuario que ingrese las temperaturas máximas de cada día de la semana
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Ingrese la temperatura máxima del día " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }

        // Calculamos el promedio de las temperaturas máximas
        double sumaTemperaturas = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            sumaTemperaturas += temperaturas[i];
        }
        double promedioTemperaturas = sumaTemperaturas / temperaturas.length;

        // Mostramos el promedio de las temperaturas máximas por pantalla
        System.out.println("El promedio de las temperaturas máximas de la última semana es: " + promedioTemperaturas);

        // Cerramos el Scanner
        scanner.close();
    }
}
