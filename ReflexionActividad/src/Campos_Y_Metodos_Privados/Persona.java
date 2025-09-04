package Campos_Y_Metodos_Privados;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad) {}

    public void saludar() {
        System.out.printf("Holaa soy " + nombre);
    }

    private void DecirEdad() {
        System.out.println("Soy " + nombre + " y tengo " + edad + " años" );
    }
}
