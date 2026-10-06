package POO.Herencia.Vehiculo;

public class Vehiculo {

    private String serial;
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;

    public Vehiculo(String serial, String marca) {
        this.serial = serial;
        this.marca = marca;
    }

    public Vehiculo(String modelo, String color, int velocidad) {
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
    }

    public void acelerar(){
        this.velocidad++;
    }

    public void frenar(){
        this.velocidad--;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }




}
