package models.Exteds;

import models.Producto;

public class Accesorios extends Producto {
    private final String color;
    private final int cantidad;

    public Accesorios(String nombre, int id, String color, int cantidad) {
        super(nombre, id);
        this.color = color;
        this.cantidad = cantidad;
    }

    public String getColor() {
        return color;
    }

    public int getCantidad() {
        return cantidad;
    }

}
