package zooAnimales;

public class Mamifero extends Animal {;
	private static int totalMamiferos = 1;
    private boolean pelaje;
    private int patas;
    public static int caballos;
    public static int leones;

    public Mamifero() {
        super();
        totalMamiferos++;
    }

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        totalMamiferos++;
      
    }
    public static Mamifero crearCaballo(String nombre, int edad, String genero) {
        caballos++;
        return new Mamifero(nombre, edad, "pradera", genero, true, 4);
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero) {
        leones++;
        return new Mamifero(nombre, edad, "selva", genero, true, 4);
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
