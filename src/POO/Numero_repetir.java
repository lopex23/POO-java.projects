package POO;

public class Numero_repetir {
    public static void main(String[] args) {
        int[] secuencia = {1, 5, 3, 5, 4, 16, 5, 8, 4};

        int numeroMasFrecuente = secuencia[0];
        int maxFrecuencia = 0;

        for (int i = 0; i < secuencia.length; i++) {
            int contador = 0;

            for (int j = 0; j < secuencia.length; j++) {
                if (secuencia[j] == secuencia[i]) {
                    contador++;
                }
            }

            if (contador > maxFrecuencia) {
                maxFrecuencia = contador;
                numeroMasFrecuente = secuencia[i];
            }
        }

        System.out.println("El numero que más se repite es: " + numeroMasFrecuente);
        System.out.println("Se repite: " + maxFrecuencia + " veces ");

    }
}



