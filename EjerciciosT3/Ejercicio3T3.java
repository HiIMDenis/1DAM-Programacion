package ejercicio3t3;
import java.util.Random;
/**
 *
 * @author Denis
 */
public class Ejercicio3T3 {

    public static void main(String[] args) {
   
     Random x = new Random();
        int num;
        do {
            num = x.nextInt(11);
            System.out.println(num);
        } while (num != 10);
         
    }
}
