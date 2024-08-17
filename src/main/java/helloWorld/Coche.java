package helloWorld;

public class Coche {

    // Variable de clase (variable estática)
    private static int totalCoches = 0;

    // Variables de instancia
    private String marca;
    private String modelo;

    // Constructor (Método especial para crear instancias de la clase)
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        totalCoches++;  // Incrementa el contador de coches cada vez que se crea un coche
    }

    // Método de instancia para mostrar la información del coche
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }

    // Método estático para mostrar el total de coches
    public static void mostrarTotalCoches() {
        System.out.println("Total de coches: " + totalCoches);
    }

    // Método de instancia con una variable local
    public void acelerar(int incremento) {
        int velocidad = incremento;  // Variable local
        System.out.println("El coche ha acelerado a " + velocidad + " km/h");
    }

    public static void main(String[] args) {
        // Creación de instancias de la clase Coche
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Honda", "Civic");

        // Llamada a métodos de instancia
        coche1.mostrarInformacion();
        coche2.mostrarInformacion();

        // Llamada a método estático
        Coche.mostrarTotalCoches();

        // Llamada a un método de instancia con una variable local
        coche1.acelerar(60);
    }
}

