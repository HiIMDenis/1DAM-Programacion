package ejerep1;

/**
 *
 * @author Denis
 */
public class EjeRep1 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 5; i <= 50; i += 5) {
            sum += i;
        }

        System.out.println("La suma de los primeros 10 numeros multiplos"
                + " de 5 es: " + sum);

    }
}