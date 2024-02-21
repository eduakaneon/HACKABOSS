import java.util.Scanner;

    public class Ejercicio2Clase2Dia3 {
        public static void main(String[] args) {
            // Creamos un objeto Scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in);

            double totalCompra = 0;
            double precioProducto = 0;

            // Utilizamos un bucle while controlado por un centinela para permitir al usuario ingresar los precios de los productos
            System.out.println("Ingrese el precio del producto (ingrese un número negativo o 0 para finalizar): ");
            precioProducto = scanner.nextDouble();

            while (precioProducto > 0) {
                // Agregamos el precio del producto al total de la compra
                totalCompra += precioProducto;

                // Pedimos al usuario que ingrese el precio del siguiente producto
                System.out.println("Ingrese el precio del siguiente producto (ingrese un número negativo o 0 para finalizar): ");
                precioProducto = scanner.nextDouble();
            }

            // Mostramos el total de la compra
            System.out.println("El total de la compra es: " + totalCompra);

            // Cerramos el Scanner
            scanner.close();
        }
    }

