package zooAnimales;

import gestion.Zona;

public class Anfibio extends Animal {
	private static int totalAnfibios = 0;
    private String colorPiel;
    private boolean venenoso;
    public static int ranas;
    public static int salamandras;

    public Anfibio() {
        super();
    }

    public Anfibio(String nombre, int edad, String habitat, String genero,Zona zona, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero, getZona());
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        totalAnfibios++;
    }
    public static Anfibio crearRana(String nombre, int edad, String genero, Zona zona) {
        ranas++;
        return new Anfibio(nombre, edad, "selva", genero, zona,  "rojo", true);
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero, Zona zona) {
        salamandras++;
        return new Anfibio(nombre, edad, "selva", genero, zona,  "negro y amarillo", false);
    }

    public static int cantidadAnfibios() {
        return totalAnfibios;
    }
    @Override
    public String movimiento() {
        return "saltar";
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }
}
