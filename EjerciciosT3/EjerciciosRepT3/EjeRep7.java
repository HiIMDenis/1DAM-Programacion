package ejerep7;

import java.util.Scanner;

/**
 *
 * @author Denis
 */
public class EjeRep7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < num.length; i++) {
            System.out.print("Ingresa un numero: ");
            num[i] = scanner.nextInt();
            if (num[i] > max) {
                max = num[i];
                maxIndex = i;
            }
            if (num[i] < min) {
                min = num[i];
                minIndex = i;
            }
        }

        System.out.println("El numero maximo es: " + max
                + " y se encuentra en la posicion: " + maxIndex);
        System.out.println("El numero minimo es: " + min
                + " y se encuentra en la posicion: " + minIndex);

    }

}
