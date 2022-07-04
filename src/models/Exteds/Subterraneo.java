package models.Exteds;

import models.Mascota;

public class Subterraneo extends Mascota {
    private String colorPiel;
    private String tipoTierra;

    public Subterraneo(String nombre, float peso, int id, String colorPiel, String tipoTierra) {
        super(nombre, peso, id);
        this.colorPiel = colorPiel;
        this.tipoTierra = tipoTierra;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public String getTipoTierra() {
        return tipoTierra;
    }
}
