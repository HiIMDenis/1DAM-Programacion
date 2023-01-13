package ejercicio5t3;

import java.util.Scanner;

/**
 *
 * @author Denis
 */
public class Ejercicio5T3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int limite;
        int totalcazadas = 0;

        System.out.print("Introduce el limite de piezas cazadas por dia: ");
        limite = sc.nextInt();

        while (totalcazadas < limite) {
            int cazada;
            System.out.print("Introduce el numero de piezas cazadas: ");
            cazada = sc.nextInt();
            totalcazadas += cazada;
            if (totalcazadas > limite) {
                System.out.println("Limite excedido.");
                break;
            }
            System.out.println("Total de piezas cazadas: " + totalcazadas);
        }
    }

}
