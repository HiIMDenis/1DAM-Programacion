package ejercicio03;
import bpc.daw.mario.*;
/**
 *
 * @author Denis
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mario m1 = null;
        Seta s1 = null;
        Cañon c1 = null;
        Planta p1, p2, p3 = null;
        Luigi l1 = null;
        
        //a
        s1 = new Seta(1000, 0);
        s1.andarHacia(0, 0);
        
        //b
        m1 = new Mario(640, 320);
        m1.saltar();
        
        //c
        l1 = new Luigi(700, 700);
        c1 = new Cañon (100, 320);
        c1.disparar(700, 700);
        
        //d
        p1 = new Planta(400,500);
        p1.comer(true);
    
        p2 = new Planta(450,500);
        p2.comer(true);
    
        p3 = new Planta(500,500);
        p3.comer(true);
        
        
        
        
        
        
        
        
        
        
    }
    
}
