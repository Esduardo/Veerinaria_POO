package models.Exteds;

import models.Mascota;

public class Acuaticos extends Mascota {
    private String tipoAgua;

    public Acuaticos(String nombre, float peso, int id, String tipoAgua) {
        super(nombre, peso, id);
        this.tipoAgua = tipoAgua;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }
}
