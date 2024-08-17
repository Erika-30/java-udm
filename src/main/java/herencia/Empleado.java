package herencia;

//se declara la clase Empleado
public class Empleado extends Persona{
    int nun_codigo;
    String cargo;
    double sueldo;

    //se crea el constructor de la clase Empleado sin parametros
    public Empleado() {
    }

    //se crea el constructor de la clase Empleado con parametros
    public Empleado(int id, String dni, String nombre, String apellido, String direccion, String telefono, int nun_codigo, String cargo, double sueldo) {
        super(id, dni, nombre, apellido, direccion, telefono);
        this.nun_codigo = nun_codigo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    // Getters y setters
    public int getNun_codigo() {
        return nun_codigo;
    }

    public void setNun_codigo(int nun_codigo) {
        this.nun_codigo = nun_codigo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }



}
