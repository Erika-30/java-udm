package basic;

public class Alumno {
    int id;
    String nombre;
    String apellido;

    // Constructor vacío (sin parámetros)
    public Alumno() {
        // Este constructor no inicializa los atributos.
    }

    // Constructor con un parámetro (id)
    public Alumno(int id) {
        this.id = id;
    }

    // Constructor con dos parámetros (id y nombre)
    public Alumno(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Constructor con tres parámetros (id, nombre, y apellido)
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters y Setters
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Método personalizado
    public void saludaar() {
        System.out.println("Hola, soy " + nombre  + " " + apellido + ", que tengan un buen día!!!");
    }
}
