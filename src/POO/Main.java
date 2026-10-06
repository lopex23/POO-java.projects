package POO;

public class Main {

    public static void main(String[] args) {


    Persona sebastian = new Persona("Sebastian", "Lopez", 19, "1040874145");
    Persona julian = new Persona ("Julian", "Vanegas", 21, "1090467746");
    Persona josue = new Persona ("Josue", "Orbegozo", 17, "1098456765");
    Persona samuel = new Persona ("Samuel", "Yepes", 18, "1064876543");
    Persona cristian = new Persona("Cristian", "Gonzalez", 17, "145678398");
    Persona juan_manuel = new Persona("Juan Manuel", "Gomez", 19, "1098765478");
    Persona julian_david = new Persona ("Julian David", "Rave", 19, "1098746324");
    Persona victor = new Persona ("Victor", "Salazar", 18, "10974654723");
    Persona cesar = new Persona ("Cesar", "Hernandez", 18, "1234875647");
    Persona harby = new Persona ("Harby", "Garcia", 25, "1098756243");


        System.out.println("Hola, soy " + sebastian.nombre + sebastian.apellido + " y tengo " + sebastian.edad + " años de edad");

        sebastian.getIdentificacion();

        System.out.println(sebastian.getIdentificacion());

        sebastian.setIdentificacion("1040876584");


    }
}
