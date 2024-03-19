package zooAnimales;

import gestion.Zona;

public class Ave extends Animal {
    private static int aguilas = 0;
    private static int halcones = 0;
    private String colorPlumas;

    public Ave() {
        super();
    }

    public Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas) {
        super(nombre, edad, habitat, genero, zona);
        this.colorPlumas = colorPlumas;
        if (nombre.equalsIgnoreCase("aguila")) {
            aguilas++;
        } else if (nombre.equalsIgnoreCase("halcon")) {
            halcones++;
        }
    }

    public static int cantidadAves() {
        return aguilas + halcones;
    }

    public static int getAguilas() {
        return aguilas;
    }

    public static int getHalcones() {
        return halcones;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public static Ave crearAguila(String nombre, int edad, String genero, Zona zona) {
        return new Ave(nombre, edad, "montanas", genero, zona, "blanco y amarillo");
    }

    public static Ave crearHalcon(String nombre, int edad, String genero, Zona zona) {
        return new Ave(nombre, edad, "acantilados", genero, zona, "cafe glorioso");
    }

    @Override
    public String movimiento() {
        return "volar";
    }

    @Override
    public String toString() {
        return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero + ", la zona en la que me ubico es " + (zona != null ? zona.getNombre() : "") + ", en el " + (zona != null && zona.getZoo() != null ? zona.getZoo().getNombre() : "zoo");
    }
}

