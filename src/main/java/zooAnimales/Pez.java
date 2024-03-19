package zooAnimales;

import gestion.Zona;

public class Pez extends Animal {
    private static int salmones = 0;
    private static int bacalaos = 0;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez() {
        super();
    }

    public Pez(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero, zona);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        if (nombre.equalsIgnoreCase("salmon")) {
            salmones++;
        } else if (nombre.equalsIgnoreCase("bacalao")) {
            bacalaos++;
        }
    }

    public static int cantidadPeces() {
        return salmones + bacalaos;
    }

    public static int getSalmones() {
        return salmones;
    }

    public static int getBacalaos() {
        return bacalaos;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }

    public static Pez crearSalmon(String nombre, int edad, String genero, Zona zona) {
        return new Pez(nombre, edad, "oceano", genero, zona, "rojo", 6);
    }

    public static Pez crearBacalao(String nombre, int edad, String genero, Zona zona) {
        return new Pez(nombre, edad, "oceano", genero, zona, "gris", 6);
    }

    @Override
    public String movimiento() {
        return "nadar";
    }

    @Override
    public String toString() {
        return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero + ", la zona en la que me ubico es " + (zona != null ? zona.getNombre() : "") + ", en el " + (zona != null && zona.getZoo() != null ? zona.getZoo().getNombre() : "zoo");
    }
}
