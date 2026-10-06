public class Profesor extends Persona {
    private String asignatura;
    private String departamento;
    private int horasDeAtencion;
    private boolean esInvestigador;

    public Profesor(String nombre, int edad, String cedula, String correo, String asignatura, String departamento, int horasDeAtencion, boolean esInvestigador) {
        super(nombre, edad, cedula, correo);
        this.asignatura = asignatura;
        this.departamento = departamento;
        this.horasDeAtencion = horasDeAtencion;
        this.esInvestigador = esInvestigador;
    }

    // Getters y Setters específicos
    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getHorasDeAtencion() {
        return horasDeAtencion;
    }

    public void setHorasDeAtencion(int horasDeAtencion) {
        this.horasDeAtencion = horasDeAtencion;
    }

    public boolean isEsInvestigador() {
        return esInvestigador;
    }

    public void setEsInvestigador(boolean esInvestigador) {
        this.esInvestigador = esInvestigador;
    }

    // Método propio de Profesor
    public void calificarExamenes(String curso) {
        System.out.println("El profesor " + getNombre() + " está calificando los exámenes de la asignatura " + curso + ".");
    }

    @Override
    public void presentarse() {
        System.out.println("--- PROFESOR ---");
        System.out.println("Hola, soy el profesor " + getNombre() + ", tengo " + getEdad() + " años.");
        System.out.println("Dicta la asignatura de " + asignatura + " en el departamento de " + departamento + ".");
        System.out.println("Horas de atención a estudiantes: " + horasDeAtencion + " hrs/semana. ¿Es investigador?: " + (esInvestigador ? "Sí" : "No"));
        mostrarDatosContacto();
        System.out.println();
    }
}