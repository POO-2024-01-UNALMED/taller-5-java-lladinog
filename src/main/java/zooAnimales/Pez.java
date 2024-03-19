package zooAnimales;


public class Pez extends Animal {
	private static int totalPeces = 0;
	private String colorEscamas;
    private int cantidadAletas;
    public static int salmones;
    public static int bacalaos;

    public Pez() {
        super();
    }

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        totalPeces++;
        
    }
    public static Pez crearBacalao(String nombre, int edad, String genero) {
    	bacalaos++;
        return new Pez(nombre, edad, "oceano", genero,"gris", 6);
    }

    public static Pez crearSalmon(String nombre, int edad, String genero) {
    	salmones++;
        return new Pez(nombre, edad, "oceano", genero,"rojo", 6);
    }
    public static int cantidadPeces() {
         return totalPeces;

    }

    @Override
    public String movimiento() {
        return "nadar";
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }
}
