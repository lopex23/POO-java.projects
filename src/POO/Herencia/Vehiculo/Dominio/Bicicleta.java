package POO.Herencia.Vehiculo.Dominio;

import POO.Herencia.Vehiculo.Vehiculo;

public class Bicicleta extends Vehiculo {
    private String manubrio;
    private String pedales;
    private String sillin;
    private String cadena;
    private int numeroPlatos;

    public Bicicleta(String modelo, String color, int velocidad, String manubrio, String pedales, String sillin, String cadena, int numeroPlatos) {
        super(modelo, color, velocidad);
        this.manubrio = manubrio;
        this.pedales = pedales;
        this.sillin = sillin;
        this.cadena = cadena;
        this.numeroPlatos = numeroPlatos;
    }

    public String getManubrio() {
        return manubrio;
    }

    public void setManubrio(String manubrio) {
        this.manubrio = manubrio;
    }

    public String getPedales() {
        return pedales;
    }

    public void setPedales(String pedales) {
        this.pedales = pedales;
    }

    public String getSillin() {
        return sillin;
    }

    public void setSillin(String sillin) {
        this.sillin = sillin;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public int getNumeroPlatos() {
        return numeroPlatos;
    }

    public void setNumeroPlatos(int numeroPlatos) {
        this.numeroPlatos = numeroPlatos;
    }


}
