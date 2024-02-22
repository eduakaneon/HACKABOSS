import java.awt.*;
    class Electrodomestico {
        // Atributos
        private int cod;
        private String marca;
        private String modelo;
        private double consumo;
        private String color;

        // Constructor con parámetros
        public Electrodomestico(int cod, String marca, String modelo, double consumo, String color) {
            this.cod = cod;
            this.marca = marca;
            this.modelo = modelo;
            this.consumo = consumo;
            this.color = color;
        }

        // Constructor vacío
        public Electrodomestico() {
            // Se puede dejar vacío o no hacer nada en este constructor
        }

        // Gets y sets
        public String getMarca() {
            return marca;
        }
        public void setMarca(String marca) {
            this.marca = marca;
        }
        public String getModelo() {
            return modelo;
        }
        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
        public double getConsumo() {
            return consumo;
        }
        public void setConsumo(double consumo) {
            this.consumo = consumo;
        }
        public String getColor() {
            return color;
        }
        public void setConsumo(String color) {
            this.color = color;
        }
        public int getCod() {
            return cod;
        }
        public void setCod(int cod) {
            this.cod = cod;
        }
        // Método principal (main)
        public static void main(String[] args) {
            // Crear 3 objetos de la clase Electrodomestico utilizando parámetros
            Electrodomestico electrodomestico1 = new Electrodomestico(1, "Samsung", "ABC123", 150.0, "Blanco");
            Electrodomestico electrodomestico2 = new Electrodomestico(2, "LG", "XYZ456", 200.0, "Negro");
            Electrodomestico electrodomestico3 = new Electrodomestico(3, "Sony", "DEF789", 180.0, "Plateado");

            // Crear 1 objeto de la clase Electrodomestico sin parámetros
            Electrodomestico electrodomesticoSinParametros = new Electrodomestico();

            // Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con parámetros
            System.out.println("Electrodoméstico 1: Marca: " + electrodomestico1.getMarca() +
                    ", Modelo: " + electrodomestico1.getModelo() +
                    ", Consumo: " + electrodomestico1.getConsumo() + " kWh");

            System.out.println("Electrodoméstico 2: Marca: " + electrodomestico2.getMarca() +
                    ", Modelo: " + electrodomestico2.getModelo() +
                    ", Consumo: " + electrodomestico2.getConsumo() + " kWh");

            System.out.println("Electrodoméstico 3: Marca: " + electrodomestico3.getMarca() +
                    ", Modelo: " + electrodomestico3.getModelo() +
                    ", Consumo: " + electrodomestico3.getConsumo() + " kWh");

            // Intenta obtener la marca del electrodoméstico creado sin parámetros
            // No se obtendrá ningún valor ya que no se ha establecido ningún valor para la marca en el constructor sin parámetros
            System.out.println("Marca del electrodoméstico sin parámetros: " + electrodomesticoSinParametros.getMarca());
        }
    }


