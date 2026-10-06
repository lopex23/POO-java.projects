package POO.ModificadorAcceso;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        if (!esFechaValida(day, month, year)) {
            throw new IllegalArgumentException("Fecha inválida: " + day + "/" + month + "/" + year);
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private boolean esFechaValida(int day, int month, int year) {
        if (month < 1 || month > 12) {
            return false;
        }

        int maxDias = obtenerDiasDelMes(month, year);
        return day >= 1 && day <= maxDias;
    }

    private int obtenerDiasDelMes(int month, int year) {
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return esBisiesto(year) ? 29 : 28;
            default:
                return 31;
        }
    }

    private boolean esBisiesto(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }

    public String obtenerFechaFormateada() {
        String diaStr = (this.day < 10) ? "0" + this.day : "" + this.day;
        String mesStr = (this.month < 10) ? "0" + this.month : "" + this.month;
        return diaStr + "/" + mesStr + "/" + this.year;
    }
}