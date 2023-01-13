package ejercicio4t3;

import java.util.Scanner;

/**
 *
 * @author Denis
 */
public class Ejercicio4T3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String respuesta;

        while (true) {
            System.out.print("Eres mayor de edad? (si/no): ");
            respuesta = scanner.nextLine().toLowerCase();

            if (respuesta.equals("si")) {
                System.out.println("El usuario es mayor de edad.");
                break;
            } else if (respuesta.equals("no")) {
                System.out.println("El usuario es menor de edad.");
                break;
            } else {
                System.out.println("No te entiendo.");
            }
        }

    }

}
