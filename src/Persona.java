public abstract class Persona {
    private String nombre;
    private int edad;
    private String cedula;
    private String correo;

    public Persona(String nombre, int edad, String cedula, String correo) {
        this.nombre = nombre;
        setEdad(edad); // Usamos el setter para validar
        this.cedula = cedula;
        setCorreo(correo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad < 130) {
            this.edad = edad;
        } else {
            System.out.println("Error: Edad no válida (" + edad + ").");
        }
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo.contains("@") && correo.contains(".")) {
            this.correo = correo;
        } else {
            this.correo = "correo_no_valido@domain.com";
        }
    }

    public void mostrarDatosContacto() {
        System.out.println("Cédula: " + cedula + " | Correo: " + correo);
    }

    public abstract void presentarse();
}