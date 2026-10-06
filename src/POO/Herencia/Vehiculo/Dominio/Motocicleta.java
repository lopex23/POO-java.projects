package POO.Herencia.Vehiculo.Dominio;

import POO.Herencia.Vehiculo.Vehiculo;

public class Motocicleta extends Vehiculo {
    private int cilindraje;
    private String transmision;
    private boolean tieneABS;
    private String tipoMotor;

    public Motocicleta(String modelo, String color, int velocidad, int cilindraje, String transmision, boolean tieneABS, String tipoMotor) {
        super(modelo, color, velocidad);
        this.cilindraje = cilindraje;
        this.transmision = transmision;
        this.tieneABS = tieneABS;
        this.tipoMotor = tipoMotor;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public boolean isTieneABS() {
        return tieneABS;
    }

    public void setTieneABS(boolean tieneABS) {
        this.tieneABS = tieneABS;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }


}
