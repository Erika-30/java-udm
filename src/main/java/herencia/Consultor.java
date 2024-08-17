package herencia;

//se declara la clase Consultor que hereda de la clase Persona
public class Consultor extends Persona{
    String especialidad;
    double tarifa;
    int tiempo_exp;

    //se crea el constructor de la clase Consultor sin parametros
    public Consultor() {
    }

    //se crea el constructor de la clase Consultor con parametros
    public Consultor(int id, String dni, String nombre, String apellido, String direccion, String telefono, String especialidad, double tarifa, int tiempo_exp) {
        super(id, dni, nombre, apellido, direccion, telefono);
        this.especialidad = especialidad;
        this.tarifa = tarifa;
        this.tiempo_exp = tiempo_exp;
    }

    // Getters y setters

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public int getTiempo_exp() {
        return tiempo_exp;
    }

    public void setTiempo_exp(int tiempo_exp) {
        this.tiempo_exp = tiempo_exp;
    }


}
