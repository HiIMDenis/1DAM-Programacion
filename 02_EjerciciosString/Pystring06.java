package pystring06;
import java.util.*;
/**
 *
 * @author Denis
 */
public class Pystring06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Pon la primera linea: ");
        String linea1 = new Scanner(System.in).nextLine();
        
        System.out.println("pon la segunda linea: ");
        String linea2 = new Scanner(System.in).nextLine();
        
        String union = linea1+" "+linea2;
        System.out.println(union);
    }
    
}
