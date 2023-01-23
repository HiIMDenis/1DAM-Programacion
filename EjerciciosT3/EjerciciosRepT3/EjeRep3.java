package ejerep3;

import java.util.Scanner;

/**
 *
 * @author Denis
 */
public class EjeRep3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String answer;
        double total = 0;
        int count = 0;
        
        do {
            System.out.print("Ingresa el nombre del producto: ");
            String product = scanner.nextLine();
            System.out.print("Ingresa el precio del producto: ");
            double price = scanner.nextDouble();
            total += price;
            count++;
            scanner.nextLine(); // Limpiar buffer de entrada
            System.out.print("Deseas ingresar otro producto? (SI/NO) ");
            answer = scanner.nextLine();
        } while (answer.equalsIgnoreCase("SI"));
       
        System.out.println("Importe total de la compra: $" + total);
       
        System.out.println("Productos comprados en total: " + count);
    }

}
