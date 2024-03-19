// Clase padre Vestimenta
class Vestimenta {
    private int codigo;
    private String nombre;
    private double precio;
    private String marca;
    private String talla;
    private String color;

    // Constructor
    public Vestimenta(int codigo, String nombre, double precio, String marca, String talla, String color) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.talla = talla;
        this.color = color;
    }

    // Método getter para obtener la marca
    public String getMarca() {
        return marca;
    }
}

// Clase Zapato
class Zapato extends Vestimenta {
    private String material;
    private String tipoCierre;

    // Constructor
    public Zapato(int codigo, String nombre, double precio, String marca, String talla, String color, String material, String tipoCierre) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    // Método para mostrar información sobre el zapato
    public void mostrarInfo() {
        System.out.println("Estos zapatos son de marca: " + getMarca());
    }
}

// Clase Pantalon
class Pantalon extends Vestimenta {
    private String estilo;
    private String tipoTejido;

    // Constructor
    public Pantalon(int codigo, String nombre, double precio, String marca, String talla, String color, String estilo, String tipoTejido) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    // Método para mostrar información sobre el pantalón
    public void mostrarInfo() {
        System.out.println("Estos pantalones son de marca: " + getMarca());
    }
}

// Clase Camiseta
class Camiseta extends Vestimenta {
    private String manga;
    private String cuello;

    // Constructor
    public Camiseta(int codigo, String nombre, double precio, String marca, String talla, String color, String manga, String cuello) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }

    // Método para mostrar información sobre la camiseta
    public void mostrarInfo() {
        System.out.println("Esta camiseta es de marca: " + getMarca());
    }
}

// Clase Sombrero
class Sombrero extends Vestimenta {
    private String tipo;
    private String tamaño;

    // Constructor
    public Sombrero(int codigo, String nombre, double precio, String marca, String talla, String color, String tipo, String tamaño) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    // Método para mostrar información sobre el sombrero
    public void mostrarInfo() {
        System.out.println("Este sombrero es de marca: " + getMarca());
    }
}

// Método main
public class ejercicio2Clase5Dia6 {
    public static void main(String[] args) {
        // Crear un vector de tipo Vestimenta
        Vestimenta[] vestimentas = new Vestimenta[9];

        // Almacenar 3 zapatos, 3 pantalones, 2 camisetas y 1 sombrero
        vestimentas[0] = new Zapato(1, "Zapato deportivo", 50.0, "Nike", "42", "Negro", "Cuero", "Cordones");
        vestimentas[1] = new Zapato(2, "Zapato casual", 40.0, "Adidas", "41", "Azul", "Lona", "Velcro");
        vestimentas[2] = new Zapato(3, "Zapato formal", 60.0, "Clarks", "40", "Café", "Piel", "Hebilla");

        vestimentas[3] = new Pantalon(4, "Pantalón vaquero", 30.0, "Levis", "32x32", "Azul", "Recto", "Denim");
        vestimentas[4] = new Pantalon(5, "Pantalón deportivo", 25.0, "Nike", "M", "Gris", "Jogger", "Poliéster");
        vestimentas[5] = new Pantalon(6, "Pantalón de vestir", 35.0, "Zara", "38", "Negro", "Slim", "Algodón");

        vestimentas[6] = new Camiseta(7, "Camiseta manga corta", 15.0, "Adidas", "L", "Blanco", "Corta", "Redondo");
        vestimentas[7] = new Camiseta(8, "Camiseta manga larga", 20.0, "Puma", "XL", "Negro", "Larga", "V");

        vestimentas[8] = new Sombrero(9, "Sombrero de paja", 10.0, "Brixton", "M", "Beige", "Panamá", "Grande");

        // Recorrer el vector y ejecutar el método que corresponde en cada posición
        for (Vestimenta v : vestimentas) {
            if (v instanceof Zapato) {
                ((Zapato) v).mostrarInfo();
            } else if (v instanceof Pantalon) {
                ((Pantalon) v).mostrarInfo();
            } else if (v instanceof Camiseta) {
                ((Camiseta) v).mostrarInfo();
            } else if (v instanceof Sombrero) {
                ((Sombrero) v).mostrarInfo();
            }
        }
    }
}
