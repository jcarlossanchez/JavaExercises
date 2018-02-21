import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cuántos numeros quieres procesar?");
        int cantidad = entrada.nextInt();

        // Este es el ciclo For
        System.out.printf("Ingresa %d datos\n", cantidad);
        for(int i=1; i<= cantidad; i++){
            System.out.printf("Dato %d: ", i);
            int num = entrada.nextInt();
            int resultado = num * 2;
            System.out.printf("Dato %d procesado: %d\n", i, resultado);
        }

        // Este es el ciclo While
        int c = 1;
        while(c <= cantidad){
            System.out.printf("Dato %d: ", c);
            int num = entrada.nextInt();
            int resultado = num * 2;
            System.out.printf("Dato %d procesado: %d\n", c, resultado);
            c++;
        }
    }
}
