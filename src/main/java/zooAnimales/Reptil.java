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

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola, Zona zona) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        this.zona = zona;
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
        Reptil.iguanas++;
        return new Reptil(nombre, edad, "humedal", genero, "verde", 3, zona);
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero, Zona zona) {
        Reptil.serpientes++;
        return new Reptil(nombre, edad, "jungla", genero, "blanco", 1, zona);
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
