package zooAnimales;
import gestion.Zona;

public class Mamifero extends Animal {;
	private static int totalMamiferos = 0;
    private boolean pelaje;
    private int patas;
    public static int caballos;
    public static int leones;

    public Mamifero() {
        super();
    }

    public Mamifero(String nombre, int edad, String habitat, String genero,Zona zona, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero, getZona());
        this.pelaje = pelaje;
        this.patas = patas;
        totalMamiferos++;
      
    }
    public static Mamifero crearCaballo(String nombre, int edad, String genero, Zona zona) {
        caballos++;
        return new Mamifero(nombre, edad, "pradera", genero, zona, true, 4);
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero, Zona zona) {
        leones++;
        return new Mamifero(nombre, edad, "selva", genero, zona, true, 4);
    }
    public static int cantidadMamiferos(){
        return totalMamiferos;
    }

    @Override
    public String movimiento() {
        return "desplazarse";
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public int getPatas() {
        return patas;
    }
}
