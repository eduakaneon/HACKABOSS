public class Ejercicio2Clase1Dia2EduardoPintado {
        public static void main(String[] args) {
            // Parte a)
            int numeroEntero = 10;
            double numeroDecimal = 3.14;
            boolean esVerdadero = true;
            String cadenaTexto = "Hola mundo";

            System.out.println("Valores asignados a las variables:");
            System.out.println("Entero: " + numeroEntero);
            System.out.println("Decimal: " + numeroDecimal);
            System.out.println("Booleano: " + esVerdadero);
            System.out.println("String: " + cadenaTexto);

            // Parte b)
            // Asignamos un int a un String
            //cadenaTexto = 123; // Esto generaría un error de compilación

            // Asignamos un String a un double
            //numeroDecimal = "3.14"; // Esto generaría un error de compilación

            // Asignamos un boolean a un int
            //numeroEntero = true; // Esto generaría un error de compilación

            // Asignamos un double a un boolean
            //esVerdadero = 3.14; // Esto generaría un error de compilación

//todas estas situaciones se produce un error de compilación debido a que se estan intentando
// realizar asignaciones entre tipos de datos incompatibles.
// Esto sucede porque Java es un lenguaje de programacion fuertemente tipado
// y no permite este tipo de conversiones implicitas entre tipos de datos diferentes.
        }
    }


