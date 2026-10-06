package POO.Herencia.Vehiculo.Dominio;

import POO.Herencia.Vehiculo.Vehiculo;

public class Barco extends Vehiculo {
    private int capacidadCamarotes;
    private double tonelajeRegistro;
    private String tipoPropulsion;
    private boolean tieneAncla;
    private double anguloTimon;

    public Barco(String modelo, String color, int velocidad, int capacidadCamarotes, double tonelajeRegistro, String tipoPropulsion, boolean tieneAncla, double anguloTimon) {
        super(modelo, color, velocidad);
        this.capacidadCamarotes = capacidadCamarotes;
        this.tonelajeRegistro = tonelajeRegistro;
        this.tipoPropulsion = tipoPropulsion;
        this.tieneAncla = tieneAncla;
        this.anguloTimon = anguloTimon;
    }

    public int getCapacidadCamarotes() {
        return capacidadCamarotes;
    }

    public void setCapacidadCamarotes(int capacidadCamarotes) {
        this.capacidadCamarotes = capacidadCamarotes;
    }

    public double getTonelajeRegistro() {
        return tonelajeRegistro;
    }

    public void setTonelajeRegistro(double tonelajeRegistro) {
        this.tonelajeRegistro = tonelajeRegistro;
    }

    public String getTipoPropulsion() {
        return tipoPropulsion;
    }

    public void setTipoPropulsion(String tipoPropulsion) {
        this.tipoPropulsion = tipoPropulsion;
    }

    public boolean isTieneAncla() {
        return tieneAncla;
    }

    public void setTieneAncla(boolean tieneAncla) {
        this.tieneAncla = tieneAncla;
    }

    public double getAnguloTimon() {
        return anguloTimon;
    }

    public void setAnguloTimon(double anguloTimon) {
        this.anguloTimon = anguloTimon;
    }


}
