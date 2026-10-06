package ModificadorAcceso;

public class AppMyDate {

    public static void main(String[] args) {
        MyDate myBirthday = new MyDate(23, 11, 2006);

        System.out.println(myBirthday.obtenerFechaFormateada());
    }
}