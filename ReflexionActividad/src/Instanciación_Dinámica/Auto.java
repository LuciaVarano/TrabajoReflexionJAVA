package Instanciación_Dinámica;

public class Auto {
    String marca;
    String patente;

    public Auto() {}

    public  Auto(String marca, String patente) {
        this.marca = marca;
        this.patente = patente;
    }

    @Override
    public String toString(){
        return "Auto[Marca: " +  marca + ", Patente: " + patente + "]";
    }
}
