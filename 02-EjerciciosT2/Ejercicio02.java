package ejercicio02;
import bpc.daw.mario.*;
/**
 *
 * @author Denis
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Mario m1, m2, m3 = null;
         Seta s1 = null;
         Cañon c1 = null;
         Planta p1, p2, p3 = null;
         Luigi l1 = null;
         
         m1 = new Mario(100);
         
         m2 = new Mario(640, 320);
        
         s1 = new Seta(0, 0);
         
         c1 = new Cañon (100, 320);
         
         p1 = new Planta(400,500);
         
         p2 = new Planta(450,500);
         
         p3 = new Planta(500,500);
        
         l1 = new Luigi(200);
         
         m3 = new Mario(l1, 50);
        
        
        
    }
    
}
