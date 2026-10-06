public class Main {
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante(
                "Valentina Gómez", 21, "1036589412", "valeria.gomez@uni.edu.co",
                "Ingeniería de Sistemas", 5, 4.45
        );

        estudiante.inscribirMateria("Estructuras de Datos");
        estudiante.inscribirMateria("Bases de Datos I");

        System.out.println();

        Profesor profesor = new Profesor(
                "Andrés Restrepo", 45, "71254896", "andres.restrepo@uni.edu.co",
                "Estructuras de Datos", "Ciencias de la Computación", 4, true
        );

        estudiante.presentarse();
        profesor.presentarse();

        System.out.println("--- Acciones adicionales ---");
        profesor.calificarExamenes("Estructuras de Datos");

        System.out.println("\n--- Probando validación de edad inválida ---");
        estudiante.setEdad(150); // Debería arrojar error de validación
    }
}