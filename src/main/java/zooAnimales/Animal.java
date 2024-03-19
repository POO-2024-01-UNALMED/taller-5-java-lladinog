package zooAnimales;

import gestion.Zona;

public class Animal {
    private static int totalAnimales = 0;
    protected String nombre;
    protected int edad;
    protected String habitat;
    protected String genero;
    protected Zona zona;

    public Animal() {
        totalAnimales++;
    }

    public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = zona;
        totalAnimales++;
    }

    public static int getTotalAnimales() {
        return totalAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
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
