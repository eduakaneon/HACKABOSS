
    // Definición de la clase Persona
    class Persona {
        // Atributos
        private int id;
        private String nombre;
        private int edad;
        private String direccion;
        private String numeroTelefono;

        // Constructor con parámetros
        public Persona(int id, String nombre, int edad, String direccion, String numeroTelefono) {
            this.id = id;
            this.nombre = nombre;
            this.edad = edad;
            this.direccion = direccion;
            this.numeroTelefono = numeroTelefono;
        }

        // Gets y sets
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getNumeroTelefono() {
            return numeroTelefono;
        }

        public void setNumeroTelefono(String numeroTelefono) {
            this.numeroTelefono = numeroTelefono;
        }

        // Método principal (main)
        public static void main(String[] args) {
            // Crear un vector de tipo Persona con cinco posiciones
            Persona[] personas = new Persona[5];

            // Crear cinco personas y guardarlas en el vector
            personas[0] = new Persona(1, "Juan", 25, "Calle 123", "123456789");
            personas[1] = new Persona(2, "María", 35, "Avenida XYZ", "987654321");
            personas[2] = new Persona(3, "Pedro", 40, "Calle Principal", "456789123");
            personas[3] = new Persona(4, "Ana", 28, "Avenida Central", "789123456");
            personas[4] = new Persona(5, "Luis", 45, "Calle Secundaria", "321654987");

            // Recorrer el vector y mostrar por pantalla el nombre y edad de cada persona almacenada
            System.out.println("Nombre y edad de cada persona:");
            for (Persona persona : personas) {
                System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
            }

            // Cambiar el nombre de dos personas
            System.out.println("\nCambio de nombre de dos personas:");
            System.out.println("Antes del cambio:");
            System.out.println("Nombre de persona 1: " + personas[0].getNombre());
            System.out.println("Nombre de persona 2: " + personas[1].getNombre());

            personas[0].setNombre("Carlos");
            personas[1].setNombre("Laura");

            System.out.println("\nDespués del cambio:");
            System.out.println("Nombre de persona 1: " + personas[0].getNombre());
            System.out.println("Nombre de persona 2: " + personas[1].getNombre());

            // Mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años
            System.out.println("\nPersonas cuya edad es mayor de 30 años:");
            for (Persona persona : personas) {
                if (persona.getEdad() > 30) {
                    System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
                }
            }
        }
    }


