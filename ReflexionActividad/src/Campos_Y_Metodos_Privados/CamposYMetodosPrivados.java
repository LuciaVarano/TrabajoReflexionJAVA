package Campos_Y_Metodos_Privados;

import java.lang.reflect.*;

public class CamposYMetodosPrivados {
    public static void main(String[] args) {
        try {
            Persona lucy = new Persona();
            Class<?> clase = lucy.getClass();

            //Modificar los valores privados
            Field nombre = clase.getDeclaredField("nombre");
            nombre.setAccessible(true);
            nombre.set(lucy, "Lucia");

            Field apellido = clase.getDeclaredField("apellido");
            nombre.setAccessible(true);
            apellido.set(lucy, "Varano");

            Field edad = clase.getDeclaredField("edad");
            edad.setAccessible(true);
            edad.set(lucy, 20);

            System.out.println("Mi nombre es " +  nombre.get(lucy) + " " + apellido.get(lucy) + " y tengo " + edad.get(lucy));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
