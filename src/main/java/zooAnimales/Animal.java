package zooAnimales;
import gestion.Zona;
public class Animal {
	private static int totalAnimales = 0;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private static Zona zona;

    public Animal() {
    }

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }
    public static int getTotalAnimales() {
        return totalAnimales;
    }
    public static Zona getZona() {
        return zona;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getGenero() {
        return genero;
    }
    public String movimiento() {
        return "desplazarse";
    }
    public String totalPorTipo() {
        return "Mamiferos: #" + Mamifero.cantidadMamiferos() +
                "\nAves: #" + Ave.cantidadAves() +
                "\nReptiles: #" + Reptil.cantidadReptiles() +
                "\nPeces: #" + Pez.cantidadPeces() +
                "\nAnfibios: #" + Anfibio.cantidadAnfibios();
    }

    @Override
    public String toString() {
        String info = "Mi nombre es " + nombre +
                ", tengo una edad de " + edad +
                ", habito en " + habitat +
                ", y mi genero es " + genero;
        if (zona != null) {
            info += ", la zona en la que me ubico es " + zona.getNombre() +
                    ", en el " + zona.getZoo().getNombre();
        }
        return info;
    }
}
