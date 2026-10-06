package POO;

public class Persona {

    public String nombre;
    public String apellido;
    public int edad;
    private String identificacion;

    public Persona(String nombre, String apellido, int edad, String identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.identificacion = identificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
}
