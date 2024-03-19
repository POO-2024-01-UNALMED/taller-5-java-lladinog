package zooAnimales;

public class Ave extends Animal {
	private static int totalAves = 0;
	private String colorPlumas;
    public static int aguilas;
    public static int halcones;

    public Ave() {
        super();
    }

    public Ave(String nombre, int edad, String habitat, String genero,String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        totalAves ++;
    }
    public static Ave crearHalcon(String nombre, int edad, String genero) {
    	halcones++;
        return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
    	aguilas++;
        return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
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
