package models;

public class Producto {
    protected static String nombre;
    protected static int id;

    public Producto(String nombre, int id) {
        Producto.nombre = nombre;
        Producto.id =  id;
    }

    public static String getNombre() {
        return nombre;
    }

    public static int getId() {
        return id;
    }

}
