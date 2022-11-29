package ejercicio37;
import java.util.*;
/**
 *
 * @author Denis <denis.stupak23@gmai.com>
 */
public class Ejercicio37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     System.out.println("Pon un numero");
     int n = new Scanner(System.in).nextInt();
        
     Integer numero = new Integer(n);
        
     System.out.println(n+"\nbinario = "+Integer.toBinaryString(n)+"\n"
             +"hexadecimal = "+Integer.toHexString(n));

    }

}
