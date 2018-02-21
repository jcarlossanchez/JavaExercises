import java.util.Scanner;

public class AdivinaElNumero {
    private Scanner entrada = new Scanner(System.in);
    private boolean juegoActivo = true;

    public void jugar() {
        String nombreJugador = obtenerNombreJugador();

        while(juegoActivo) {
            int intentos = 0;
            int minimo = 0;
            int maximo = 100;
            int numeroJuego = obtenerNumeroAleatorio(minimo, maximo);

            System.out.printf("%s, he escogido un número entre %d y %d, adivinalo\n", nombreJugador, minimo, maximo);
            int numeroJugador;

            do {
                numeroJugador = escogerNumero();
                mensaje(numeroJuego, numeroJugador);

                intentos++;
            } while(numeroJuego != numeroJugador);

            System.out.printf("Has ganado, intentos %d\n", intentos);

            juegoActivo = jugarNuevamente();
        }
    }

    private int obtenerNumeroAleatorio(int min, int max) {
        return min + (int) (Math.random() * ( (max - min) + 1) );
    }

    private String obtenerNombreJugador() {
        System.out.println("Hola, ¿Cuál es tu nombre?");
        String nombreJugador = entrada.nextLine();
        System.out.printf("Bienvenido %s, vamos a comenzar\n", nombreJugador);
        return nombreJugador;
    }

    private int escogerNumero() {
        System.out.printf("Escoge un numero\n ");
        return entrada.nextInt();
    }

    private void mensaje(int numeroJuego, int numeroJugador) {
        if (numeroJuego < numeroJugador) {
            System.out.println("Muy alto, adivina otra vez.");
        } else if (numeroJuego > numeroJugador) {
            System.out.println("Muy bajo, adivina otra vez.");
        }
    }

    public boolean jugarNuevamente() {
        System.out.println("¿Jugar nuevamente?\n 1) Si\n 2) No");
        int respuesta = entrada.nextInt();

        if (respuesta == 1) {
            System.out.println("Juguemos otra vez\n");
            return true;
        } else {
            System.out.println("Fin del juego, gracias por participar");
            return false;
        }
    }
}
