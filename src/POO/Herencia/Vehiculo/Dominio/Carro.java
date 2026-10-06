package POO.Herencia.Vehiculo.Dominio;

import POO.Herencia.Vehiculo.Vehiculo;

public class Carro extends Vehiculo {
    private int numeroDePuertas;
    private int capacidadPasajeros;
    private String tipoTraccion;
    private boolean esDescapotable;
    private int numeroAirbags;

    public Carro(String modelo, String color, int velocidad, int numeroDePuertas, int capacidadPasajeros, String tipoTraccion, boolean esDescapotable, int numeroAirbags) {
        super(modelo, color, velocidad);
        this.numeroDePuertas = numeroDePuertas;
        this.capacidadPasajeros = capacidadPasajeros;
        this.tipoTraccion = tipoTraccion;
        this.esDescapotable = esDescapotable;
        this.numeroAirbags = numeroAirbags;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getTipoTraccion() {
        return tipoTraccion;
    }

    public void setTipoTraccion(String tipoTraccion) {
        this.tipoTraccion = tipoTraccion;
    }

    public boolean isEsDescapotable() {
        return esDescapotable;
    }

    public void setEsDescapotable(boolean esDescapotable) {
        this.esDescapotable = esDescapotable;
    }

    public int getNumeroAirbags() {
        return numeroAirbags;
    }

    public void setNumeroAirbags(int numeroAirbags) {
        this.numeroAirbags = numeroAirbags;
    }


}
