package zooAnimales;

import gestion.Zona;

public class Reptil extends Animal {
    private static int iguanas = 0;
    private static int serpientes = 0;
    private String colorEscamas;
    private int largoCola;

    public Reptil() {
        super();
    }

    public Reptil(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero, zona);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        if (nombre.equalsIgnoreCase("iguana")) {
            iguanas++;
        } else if (nombre.equalsIgnoreCase("serpiente")) {
            serpientes++;
        }
    }

    public static int cantidadReptiles() {
        return iguanas + serpientes;
    }

    public static int getIguanas() {
        return iguanas;
    }

    public static int getSerpientes() {
        return serpientes;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }

    public static Reptil crearIguana(String nombre, int edad, String genero, Zona zona) {
        return new Reptil(nombre, edad, "bosque", genero, zona, "verde", 1);
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero, Zona zona) {
        return new Reptil(nombre, edad, "jungla", genero, zona, "blanco", 1);
    }

    @Override
    public String movimiento() {
        return "reptar";
    }

    @Override
    public String toString() {
        return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero + ", la zona en la que me ubico es " + (zona != null ? zona.getNombre() : "") + ", en el " + (zona != null && zona.getZoo() != null ? zona.getZoo().getNombre() : "zoo");
    }
}
