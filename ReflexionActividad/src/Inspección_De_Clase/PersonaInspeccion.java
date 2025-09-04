package Inspección_De_Clase;

public class PersonaInspeccion {
    private String nombre;
    private String apellido;
    private int edad;

    public PersonaInspeccion() {
    }

    public PersonaInspeccion(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void saludar() {
        System.out.printf("Holaa soy " + nombre);
    }

}

