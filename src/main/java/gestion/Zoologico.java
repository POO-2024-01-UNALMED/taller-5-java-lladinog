package gestion;

import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas = new ArrayList<>();

    public Zoologico() {
    }

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }
    public void agregarZonas(Zona zona) {
        zonas.add(zona);
    }

    public ArrayList<Zona> getZona() {
        return zonas;
    }

    public int cantidadTotalAnimales() {
        int totalAnimales = 0;
        for (Zona zona : zonas) {
            totalAnimales += zona.cantidadAnimales();
        }
        return totalAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}


