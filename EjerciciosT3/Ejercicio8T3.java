package ejercicio8t3;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Denis
 */
public class Ejercicio8T3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba una frase: ");
        String frase = sc.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(frase);
        int numPalabras = tokenizer.countTokens();

        System.out.println("Total de palabras encontradas: " + numPalabras);

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }

    }

}
