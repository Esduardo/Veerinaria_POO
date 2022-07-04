package models;

public class Mascota {
    protected String nombre;
    protected float peso;
    protected int id;

    public Mascota(String nombre, float peso, int id){
        this.nombre = nombre;
        this.peso =  peso;
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }

    public float getPeso() {
        return peso;
    }

    public int getId() {
        return id;
    }
}
