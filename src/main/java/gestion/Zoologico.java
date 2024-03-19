package gestion;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private List<Zona> zonas;

    public Zoologico() {
        this.zonas = new ArrayList<>();
    }

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public List<Zona> getZonas() {
        return zonas;
    }

    public void agregarZonas(Zona zona) {
        this.zonas.add(zona);
    }

    public int cantidadTotalAnimales() {
        int totalAnimales = 0;
        for (Zona zona : zonas) {
            totalAnimales += zona.cantidadAnimales();
        }
        return totalAnimales;
    }
}

