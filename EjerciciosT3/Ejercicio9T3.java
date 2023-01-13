package ejercicio9t3;

import java.util.Scanner;

/**
 *
 * @author Denis
 */
public class Ejercicio9T3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        double n = sc.nextDouble();
        double s = 1;
        double a = 1;

        while (Math.abs(s - a) >= 0.000001) {
            a = s;
            s = (s + n / s) / 2;
        }
        System.out.println("La raiz cuadrada aproximada de " + n + " es " + s);
    }

}