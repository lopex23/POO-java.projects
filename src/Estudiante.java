import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {
    private String programa;
    private int semestre;
    private double promedioAcumulado;
    private List<String> materiasInscritas;

    public Estudiante(String nombre, int edad, String cedula, String correo, String programa, int semestre, double promedioAcumulado) {
        super(nombre, edad, cedula, correo);
        this.programa = programa;
        this.semestre = semestre;
        setPromedioAcumulado(promedioAcumulado);
        this.materiasInscritas = new ArrayList<>();
    }

    // Getters y Setters específicos
    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public double getPromedioAcumulado() {
        return promedioAcumulado;
    }

    public void setPromedioAcumulado(double promedioAcumulado) {
        if (promedioAcumulado >= 0.0 && promedioAcumulado <= 5.0) {
            this.promedioAcumulado = promedioAcumulado;
        } else {
            this.promedioAcumulado = 0.0;
        }
    }

    public List<String> getMateriasInscritas() {
        return materiasInscritas;
    }

    public void inscribirMateria(String materia) {
        materiasInscritas.add(materia);
        System.out.println(getNombre() + " se ha inscrito exitosamente en: " + materia);
    }

    @Override
    public void presentarse() {
        System.out.println("--- ESTUDIANTE ---");
        System.out.println("Hola, soy " + getNombre() + ", tengo " + getEdad() + " años.");
        System.out.println("Estudio " + programa + " (Semestre " + semestre + ") con un promedio de " + promedioAcumulado + ".");
        mostrarDatosContacto();
        System.out.println("Materias inscritas: " + materiasInscritas);
        System.out.println();
    }
}