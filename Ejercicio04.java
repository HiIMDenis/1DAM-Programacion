package ejercicio04;
import bpc.daw.mario.*;

/**
 *
 * @author Denis
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       Mario m1 = null;
       Luigi l1 = null;
       
       l1 = new Luigi(500);
       m1 = new Mario(l1,-50);
       
       double disX = l1.getX();
       double disY = l1.getY();
       
       double distanciaX = m1.getX();
       double distanciaY = m1.getY();
       
       System.out.println("El muneco de mario esta en "+distanciaX+" y "+distanciaY);
       System.out.println("El muneco de luigi esta en "+disX+" y "+disY);

        
        
        
        
        
        
        
    }
    
}
