package Modificacion_En_Tiempo_De_Ejecucion;

import javassist.*;
import Modificacion_En_Tiempo_De_Ejecucion.Libro;

public class ModificacionTiempoEjecucion {
    public static void main(String[] args) {
        try {
            //Clase que actua como un contenedor de clases
            ClassPool pool = ClassPool.getDefault();
            CtClass cc = pool.get("Modificacion_En_Tiempo_De_Ejecucion.Libro");

            //Crear un nuevo método
            CtMethod method = CtNewMethod.make(
                    "public void NuevoMetodo() { System.out.println(\"Nuevo método creado\"); }", cc
            );

            cc.addMethod(method);
            cc.writeFile("target/classes");

            System.out.println("Método agregado con éxito");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
