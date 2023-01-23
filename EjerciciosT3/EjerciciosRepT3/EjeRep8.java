package ejerep8;

import java.util.Random;

/**
 *
 * @author Denis
 */
public class EjeRep8 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] num = new int[20];

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(100);
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println("El elemento en la posicion " + i
                    + " es " + num[i]);
        }
    }

}
