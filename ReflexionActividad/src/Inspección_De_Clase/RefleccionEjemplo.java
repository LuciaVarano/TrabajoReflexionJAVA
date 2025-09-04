package Inspección_De_Clase;

import java.lang.reflect.*;

public class RefleccionEjemplo {
    public static void main(String[] args) {
        try {
            //Cuando están dentro de un paquete hay que agregar el paquete Inspección_De_Clase.PersonaInspeccion.
            String nombreClase = javax.swing.JOptionPane.showInputDialog(null, "Ingrese el nombre de la clase: ");
            Class<?> clase = Class.forName(nombreClase);
            System.out.printf("El nombre de la clase es: " + clase.getName() + "\n");

            //Imprimir constructores
            System.out.println("\n--Constructores--");
            Constructor<?>[] constructores = clase.getDeclaredConstructors();
            for (Constructor<?> constructor : constructores) {
                System.out.println(constructor);
            }

            //Imprimir métodos
            System.out.println("\n--Métodos de la clase-- ");
            Method[] methodes = clase.getDeclaredMethods();
            for (Method method : methodes) {
                System.out.println(method);
            }

            //Imprimir campos
            System.out.println("\n--Campos de la clase--");
            Field[] fields = clase.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

