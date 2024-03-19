package zooAnimales;

import gestion.Zona;

public class Mamifero extends Animal {
    private static int caballos = 0;
    private static int leones = 0;
    private boolean pelaje;
    private int patas;

    public Mamifero() {
        super();
    }

    public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero, zona);
        this.pelaje = pelaje;
        this.patas = patas;
        if (nombre.equalsIgnoreCase("caballo")) {
            caballos++;
        } else if (nombre.equalsIgnoreCase("leon")) {
            leones++;
        }
    }

    public static int cantidadMamiferos() {
        return caballos + leones;
    }

    public static int getCaballos() {
        return caballos;
    }

    public static int getLeones() {
        return leones;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero, Zona zona) {
        return new Mamifero(nombre, edad, "pradera", genero, zona, true, 4);
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero, Zona zona) {
        return new Mamifero(nombre, edad, "selva", genero, zona, true, 4);
    }

    @Override
    public String movimiento() {
        return "desplazarse";
    }

    @Override
    public String toString() {
        return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero + ", la zona en la que me ubico es " + (zona != null ? zona.getNombre() : "") + ", en el " + (zona != null && zona.getZoo() != null ? zona.getZoo().getNombre() : "zoo");
    }
}
