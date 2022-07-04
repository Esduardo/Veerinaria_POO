package models.Exteds;

import models.Mascota;

public class Terrestres extends Mascota {
    private String HabitadNatural;

    public Terrestres(String nombre, float peso, int id, String habitadNatural) {
        super(nombre, peso, id);
        HabitadNatural = habitadNatural;
    }

    public String getHabitadNatural() {
        return HabitadNatural;
    }
}
