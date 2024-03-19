import java.util.ArrayList;
import java.util.Calendar;

// Clase abstracta Vehiculo
abstract class Vehiculo {
    protected int id;
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int año;
    protected double costo;

    // Constructor
    public Vehiculo(int id, String placa, String marca, String modelo, int año, double costo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.costo = costo;
    }

    // Método abstracto para calcular la antigüedad del vehículo
    public abstract int calcularAntiguedad();
}

// Interface Electrico
interface Electrico {
    void cargarEnergia();
}

// Interface Combustion
interface Combustion {
    void recargarCombustible();
}

// Clase Auto
class Auto extends Vehiculo implements Electrico {
    private int capacidadBateria;
    private double autonomia;

    // Constructor
    public Auto(int id, String placa, String marca, String modelo, int año, double costo, int capacidadBateria, double autonomia) {
        super(id, placa, marca, modelo, año, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    // Implementación del método abstracto de la clase Vehiculo para calcular la antigüedad
    @Override
    public int calcularAntiguedad() {
        int añoActual = Calendar.getInstance().get(Calendar.YEAR);
        return añoActual - año;
    }

    // Implementación del método de la interfaz Electrico para cargar energía
    @Override
    public void cargarEnergia() {
        System.out.println("Cargando energía del auto eléctrico con capacidad de batería: " + capacidadBateria + "mAh");
    }
}

// Clase Camioneta
class Camioneta extends Vehiculo implements Combustion {
    private int capacidadTanque;
    private double consumoCombustible;

    // Constructor
    public Camioneta(int id, String placa, String marca, String modelo, int año, double costo, int capacidadTanque, double consumoCombustible) {
        super(id, placa, marca, modelo, año, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    // Implementación del método abstracto de la clase Vehiculo para calcular la antigüedad
    @Override
    public int calcularAntiguedad() {
        int añoActual = Calendar.getInstance().get(Calendar.YEAR);
        return añoActual - año;
    }

    // Implementación del método de la interfaz Combustion para recargar combustible
    @Override
    public void recargarCombustible() {
        System.out.println("Recargando combustible de la camioneta con capacidad de tanque: " + capacidadTanque + " litros");
    }
}

// Clase Moto
class Moto extends Vehiculo implements Combustion {
    private int cilindrada;
    private String tipoMotor;

    // Constructor
    public Moto(int id, String placa, String marca, String modelo, int año, double costo, int cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, año, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    // Implementación del método abstracto de la clase Vehiculo para calcular la antigüedad
    @Override
    public int calcularAntiguedad() {
        int añoActual = Calendar.getInstance().get(Calendar.YEAR);
        return añoActual - año;
    }

    // Implementación del método de la interfaz Combustion para recargar combustible
    @Override
    public void recargarCombustible() {
        System.out.println("Recargando combustible de la moto con cilindrada: " + cilindrada + " cc");
    }
}

// Clase Main
public class ejercicio1Clase6Dia7 {
    public static void main(String[] args) {
        // Crear un ArrayList de tipo Vehiculo
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        // Crear objetos de diferentes tipos de vehículos y añadirlos al ArrayList
        vehiculos.add(new Auto(1, "ABC123", "Tesla", "Model S", 2020, 80000, 75000, 8.5));
        vehiculos.add(new Camioneta(2, "DEF456", "Toyota", "Hilux", 2019, 60000, 80, 12.5));
        vehiculos.add(new Moto(3, "GHI789", "Honda", "CBR600RR", 2017, 10000, 600, "4 tiempos"));

        // Mostrar información sobre cada vehículo
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Tipo de vehículo: " + vehiculo.getClass().getSimpleName());
            System.out.println("ID: " + vehiculo.id);
            System.out.println("Placa: " + vehiculo.placa);
            System.out.println("Marca: " + vehiculo.marca);
            System.out.println("Modelo: " + vehiculo.modelo);
            System.out.println("Año: " + vehiculo.año);
            System.out.println("Costo: $" + vehiculo.costo);
            System.out.println("Antigüedad: " + vehiculo.calcularAntiguedad() + " años");

            // Verificar si el vehículo implementa la interfaz Electrico o Combustion y llamar al método correspondiente
            if (vehiculo instanceof Electrico) {
                ((Electrico) vehiculo).cargarEnergia();
            } else if (vehiculo instanceof Combustion) {
                ((Combustion) vehiculo).recargarCombustible();
            }

            System.out.println(); // Salto de línea para separar la información de cada vehículo
        }
    }
}

