package models.Exteds;

import models.Mascota;

public class Voladores extends Mascota {
    private String tipoPlumas;
    private String habitad;

    public Voladores(String nombre, float peso, int id, String tipoPlumas, String habitad) {
        super(nombre, peso, id);
        this.tipoPlumas = tipoPlumas;
        this.habitad = habitad;
    }

    public String getTipoPlumas() {
        return tipoPlumas;
    }

    public String getHabitad() {
        return habitad;
    }
}
