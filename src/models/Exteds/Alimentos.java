package models.Exteds;

import models.Producto;

import java.util.ArrayList;

public class Alimentos extends Producto {
    private final int kilos;
    private final String marca;

    public Alimentos(String nombre, int id, int kilos, String marca) {
        super(nombre, id);
        this.kilos = kilos;
        this.marca = marca;
    }

    public ArrayList<Alimentos> listaAlimentos =  new ArrayList<>();


    public int getKilos() {
        return kilos;
    }

    public String getMarca() {
        return marca;
    }
}
