package zooAnimales;


public class Reptil extends Animal {

	private static int totalReptiles = 0;
    private String colorEscamas;
    private int largoCola;
    public static int iguanas;
    public static int serpientes;

    public Reptil() {
        super();
    }

    public Reptil(String nombre, int edad, String habitat, String genero,String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        totalReptiles++;
    }
    public static Reptil crearIguana(String nombre, int edad, String genero) {
    	iguanas++;
        return new Reptil(nombre, edad, "humedad", genero, "verde", 3);
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero) {
    	serpientes++;
        return new Reptil(nombre, edad, "jungla", genero,"blanco", 1);
    }
    public static int cantidadReptiles() {
        return totalReptiles;
    }

    @Override
    public String movimiento() {
        return "reptar";
    }

    public String getColorEscamas() {
        return colorEscamas;
    }
    public int getLargoCola() {
        return largoCola;
    }
}
