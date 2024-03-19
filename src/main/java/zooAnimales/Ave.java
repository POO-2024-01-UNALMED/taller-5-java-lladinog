package zooAnimales;

import gestion.Zona;

public class Ave extends Animal {
	private static int totalAves = 0;
	private String colorPlumas;
    public static int aguilas;
    public static int halcones;

    public Ave() {
        super();
    }

    public Ave(String nombre, int edad, String habitat, String genero,Zona zona, String colorPlumas) {
        super(nombre, edad, habitat, genero, getZona());
        this.colorPlumas = colorPlumas;
        totalAves ++;
    }
    public static Ave crearHalcon(String nombre, int edad, String genero, Zona zona) {
    	halcones++;
        return new Ave(nombre, edad, "montanas", genero, zona,  "cafe glorioso");
    }

    public static Ave crearAguila(String nombre, int edad, String genero, Zona zona) {
    	aguilas++;
        return new Ave(nombre, edad, "montanas", genero, zona,  "blanco y amarillo");
    }
    public static int cantidadAves() {
        return totalAves ;
    }

    @Override
    public String movimiento() {
        return "volar";
    }

    public String getColorPlumas() {
        return colorPlumas;
    }
}
