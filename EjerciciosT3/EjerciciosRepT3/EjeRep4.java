package ejerep4;

import java.util.Scanner;

/**
 *
 * @author Denis
 */
public class EjeRep4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el numero de alumnos: ");
        
        int numS = scanner.nextInt();
        
        for (int i = 1; i <= numS; i++) {
            double total = 0;
            System.out.println("Ingresa las notas del alumno " + i + ":");
            for (int j = 1; j <= 4; j++) {
                System.out.print("Actividad " + j + ": ");
                double activida = scanner.nextDouble();
                total += activida;
            }
           
            System.out.print("Nota del examen: ");
            double exam = scanner.nextDouble();
            total += exam * 0.6;
           
            System.out.print("Nota de actitud: ");
            double actitud = scanner.nextDouble();
            total += actitud * 0.1;
            double s = total / 5;
           
            System.out.println("La nota media del alumno " + i + " es: " + s);
        }

    }

}
