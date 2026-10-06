package POO.Herencia.Vehiculo.Dominio;

import POO.Herencia.Vehiculo.Vehiculo;

public class Avion extends Vehiculo {
    private double altitudMaxima;
    private int numeroMotores;
    private String tipoPropulsion;
    private double capacidadAutonomiaHoras;
    private double envergadura;

    public Avion(String modelo, String color, int velocidad, double altitudMaxima, int numeroMotores, String tipoPropulsion, double capacidadAutonomiaHoras, double envergadura) {
        super(modelo, color, velocidad);
        this.altitudMaxima = altitudMaxima;
        this.numeroMotores = numeroMotores;
        this.tipoPropulsion = tipoPropulsion;
        this.capacidadAutonomiaHoras = capacidadAutonomiaHoras;
        this.envergadura = envergadura;
    }

    public void despegar() {
        for(int i = 0; i < 300; i++){
            super.acelerar();
        }

        System.out.println(
                "El avion a despegado a una velocidad de " + super.getVelocidad()+ "km/h ");


    }

    public double getAltitudMaxima() {
        return altitudMaxima;
    }

    public void setAltitudMaxima(double altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    public String getTipoPropulsion() {
        return tipoPropulsion;
    }

    public void setTipoPropulsion(String tipoPropulsion) {
        this.tipoPropulsion = tipoPropulsion;
    }

    public double getCapacidadAutonomiaHoras() {
        return capacidadAutonomiaHoras;
    }

    public void setCapacidadAutonomiaHoras(double capacidadAutonomiaHoras) {
        this.capacidadAutonomiaHoras = capacidadAutonomiaHoras;
    }

    public double getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(double envergadura) {
        this.envergadura = envergadura;
    }


}