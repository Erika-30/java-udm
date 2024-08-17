package com.basics;

import basic.Alumno;


public class Main {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno(); // Constructor vacío, necesita setters con todos los atributos
        Alumno alumno2 = new Alumno(1); // Constructor con un parámetro, necesita setters con los atributos nombre y apellido
        Alumno alumno3 = new Alumno(2, "Carlos"); // Constructor con dos parámetros, necesita un setter con el atributo apellido
        Alumno alumno4 = new Alumno(1, "Judith", "Huisa");

        //setters
        alumno1.setId(1);
        alumno1.setNombre("Carlos");
        alumno1.setApellido("Achir");

        alumno2.setNombre("pedro");
        alumno2.setApellido("Perez");

        alumno3.setApellido("Llave");

        System.out.println("Hola, soy " + alumno1.getNombre() + " y mi apellido es: " + alumno1.getApellido() + " mi id es: " + alumno1.getId());
        System.out.println("Hola, soy " + alumno2.getNombre() + " y mi apellido es: " + alumno2.getApellido() + " mi id es: " + alumno2.getId());
        System.out.println("Hola, soy " + alumno3.getNombre() + " y mi apellido es: " + alumno3.getApellido() + " mi id es: " + alumno3.getId());
        System.out.println("Hola, soy " + alumno4.getNombre() + " y mi apellido es: " + alumno4.getApellido() + " mi id es: " + alumno4.getId());

        // Llamando al método personalizado
        alumno4.saludaar();

        // modificar valores
        alumno1.setNombre("Lulu");
        alumno1.setApellido("Lopez");
        alumno1.setId(9);

        System.out.println("Hola, soy " + alumno1.getNombre() + " y mi apellido es: " + alumno1.getApellido() + " mi id es: " + alumno1.getId());

    }
}
