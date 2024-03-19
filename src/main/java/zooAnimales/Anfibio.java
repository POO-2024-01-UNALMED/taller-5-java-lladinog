package zooAnimales;

import gestion.Zona;

public class Anfibio extends Animal {
    private static int ranas = 0;
    private static int salamandras = 0;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio() {
        super();
    }

    public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero, zona);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        if (nombre.equalsIgnoreCase("rana")) {
            ranas++;
        } else if (nombre.equalsIgnoreCase("salamandra")) {
            salamandras++;
        }
    }

    public static int cantidadAnfibios() {
        return ranas + salamandras;
    }

    public static int getRanas() {
        return ranas;
    }

    public static int getSalamandras() {
        return salamandras;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public static Anfibio crearRana(String nombre, int edad, String genero, Zona zona) {
        return new Anfibio(nombre, edad, "selva", genero, zona, "verde", true);
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero, Zona zona) {
        return new Anfibio(nombre, edad, "selva", genero, zona, "negro y amarillo", false);
    }

    @Override
    public String movimiento() {
        return "saltar";
    }

    @Override
    public String toString() {
        return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero + ", la zona en la que me ubico es " + (zona != null ? zona.getNombre() : "") + ", en el " + (zona != null && zona.getZoo() != null ? zona.getZoo().getNombre() : "zoo");
    }
}
