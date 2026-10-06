package POO.Herencia.Vehiculo.Dominio;

import POO.Herencia.Vehiculo.Vehiculo;

public class Taxi extends Vehiculo {
    private int llantas;
    private String placa;
    private double taximetro;

    public Taxi(String modelo, String color, int velocidad, int llantas, String placa, double taximetro) {
        super(modelo, color, velocidad);
        this.llantas = llantas;
        this.placa = placa;
        this.taximetro = taximetro;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getTaximetro() {
        return taximetro;
    }

    public void setTaximetro(double taximetro) {
        this.taximetro = taximetro;
    }


}



