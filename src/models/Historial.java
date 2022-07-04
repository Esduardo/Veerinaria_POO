package models;

public class Historial {
    private String nom;
    private String nomCosaNecesitada;
    private String carac;
    private float precioCon;
    private float pagTotal;

    public Historial(String nomCosaNecesitada, String carac, float precioCon, float pagTotal) {
        this.nomCosaNecesitada = nomCosaNecesitada;
        this.carac = carac;
        this.precioCon = precioCon;
        this.pagTotal =  pagTotal;
    }

    public String getNomCosaNecesitada() {
        return nomCosaNecesitada;
    }

    public String getCarac() {
        return carac;
    }

    public float getPrecioCon() {
        return precioCon;
    }

    public float getPagTotal() {
        return pagTotal;
    }
}
