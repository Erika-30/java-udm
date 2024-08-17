package com.herencia;

import herencia.Empleado;
import herencia.Consultor;

//se declara la clase Herencia
public class Herencia {

    //se crea el metodo main que se encarga de ejecutar el programa
    public static void main(String[] args) {

        //se crea un objeto de la clase Empleado sin parametros
        Empleado empleado1 = new Empleado();

        //se le asignan valores a los atributos del objeto empleado1 basado en la clase Empleado, quien hereda de la clase Persona
        empleado1.setId(1);
        empleado1.setDni("12345678");
        empleado1.setNombre("Juan");
        empleado1.setApellido("Perez");
        empleado1.setDireccion("Av. Los Pinos 123");
        empleado1.setTelefono("987654321");
        //se asignan valores a los atributos propios de la clase Empleado
        empleado1.setNun_codigo(123);
        empleado1.setCargo("Gerente");
        empleado1.setSueldo(5000.0);

        Consultor consultor1 = new Consultor();
        consultor1.setId(2);
        consultor1.setDni("87654321");
        consultor1.setNombre("Maria");
        consultor1.setApellido("Gomez");
        consultor1.setDireccion("Av. Los Pinos 456");
        consultor1.setTelefono("123456789");
        //se asignan valores a los atributos propios de la clase Consultor
        consultor1.setEspecialidad("Desarrollo de Software");
        consultor1.setTarifa(100.0);
        consultor1.setTiempo_exp(5);



        System.out.println("Empleado 1");
        System.out.println("Hola soy "+ empleado1.getNombre() + " mi ID es: " + empleado1.getId() + " soy "+ empleado1.getCargo());

        System.out.println("Consultor 1");
        System.out.println("Hola soy "+ consultor1.getNombre() + " mi ID es: " + consultor1.getId() + " mi especialidad es: "+ consultor1.getEspecialidad());


    }
}