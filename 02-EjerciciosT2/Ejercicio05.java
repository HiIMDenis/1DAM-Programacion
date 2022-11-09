package ejercicio5;
import bpc.daw.mario.*;
import java.util.concurrent.*;
import java.util.Scanner;
/**
 *
 * @author Denis
 */
public class Ejercicio5 {

    
    public static void main(String[] args) {
       
        Cañon c1, c2 = null;
        c1 = new Cañon(0,100);
        c1.disparar(100, 100);
        c1.disparar(200, 100);
        
        c2 = new Cañon (0, 0);
        c2.disparar(100, 0);
        c2.disparar(200, 0);
        c2.disparar(300, 0);
        
        System.out.println("Cuantas veces ha disparado el canon 1?");
        int dis1 = new Scanner(System.in).nextInt();
        System.out.println("el 2?");
        int dis2 = new Scanner(System.in).nextInt();
        
        System.out.println("El canon 1 ha disparado "+dis1+" vesces y el canon 2 ha disparado "+dis2+" veces.");
        
        
        
        
        
    }
    
}
