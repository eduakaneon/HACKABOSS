public class ejercicioRepasoDia5 {
    public static class Verdura {
        // Atributos
        private int id;
        private String nombre;
        private String color;
        private int calorias;
        private boolean debeCocinarse;

        // Constructor con parámetros
        public Verdura(int id, String nombre, String color, int calorias, boolean debeCocinarse) {
            this.id = id;
            this.nombre = nombre;
            this.color = color;
            this.calorias = calorias;
            this.debeCocinarse = debeCocinarse;
        }

        // Getters y setters
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

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getCalorias() {
            return calorias;
        }

        public void setCalorias(int calorias) {
            this.calorias = calorias;
        }

        public boolean isDebeCocinarse() {
            return debeCocinarse;
        }

        public void setDebeCocinarse(boolean debeCocinarse) {
            this.debeCocinarse = debeCocinarse;
        }

        // Método para mostrar información de la verdura
        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre + ", Calorías: " + calorias);
        }
    }

    public static class Main {
        public static void main(String[] args) {
            // Crear un vector de tipo Verdura que pueda almacenar 5 verduras
            Verdura[] verduras = new Verdura[5];

            // Crear 5 verduras y guardarlas en el vector
            verduras[0] = new Verdura(1, "Tomate", "Rojo", 20, false);
            verduras[1] = new Verdura(2, "Lechuga", "Verde", 10, false);
            verduras[2] = new Verdura(3, "Zanahoria", "Naranja", 30, true);
            verduras[3] = new Verdura(4, "Brócoli", "Verde", 25, true);
            verduras[4] = new Verdura(5, "Pimiento", "Rojo", 15, false);

            // Recorrer el vector creado y mostrar por pantalla el nombre y las calorías de las verduras almacenadas
            System.out.println("Nombre y calorías de las verduras:");
            for (Verdura verdura : verduras) {
                System.out.println("Nombre: " + verdura.getNombre() + ", Calorías: " + verdura.getCalorias());
            }

            // Cambiar todos los datos de dos verduras
            verduras[0].setId(6);
            verduras[0].setNombre("Cebolla");
            verduras[0].setColor("Blanco");
            verduras[0].setCalorias(40);
            verduras[0].setDebeCocinarse(true);

            verduras[1].setId(7);
            verduras[1].setNombre("Papa");
            verduras[1].setColor("Marrón");
            verduras[1].setCalorias(50);
            verduras[1].setDebeCocinarse(true);

            // Mostrar por pantalla los datos de todas las verduras luego del cambio
            System.out.println("\nDatos de todas las verduras luego del cambio:");
            for (Verdura verdura : verduras) {
                System.out.println(verdura.getNombre() + ", " + verdura.getColor() + ", " + verdura.getCalorias() + ", " + verdura.isDebeCocinarse());
            }

            // Recorrer el vector y mostrar por pantalla únicamente a las verduras que sean de color verde
            System.out.println("\nVerduras de color verde:");
            for (Verdura verdura : verduras) {
                if ("Verde".equals(verdura.getColor())) {
                    System.out.println(verdura.getNombre());
                }
            }
        }
    }
}
