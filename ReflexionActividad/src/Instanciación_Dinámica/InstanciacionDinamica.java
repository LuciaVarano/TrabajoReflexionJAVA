package Instanciación_Dinámica;
import java.lang.reflect.*;

public class InstanciacionDinamica {
    public static void main(String[] args) {
        try {
            String nombreClase =  javax.swing.JOptionPane.showInputDialog(null, "Ingrese el nombre de la clase: ");
            Class<?> clase = Class.forName(nombreClase);
            System.out.println("➦ NOMBRE DE LA CLASE: " + clase);

            Constructor<?> constructor = Auto.class.getConstructor(String.class, String.class);
            Auto autito = (Auto) constructor.newInstance("BMW", "8DA-AA8");
            System.out.println("\n" + autito);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
