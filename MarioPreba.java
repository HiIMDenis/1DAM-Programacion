
package mariopreba;
import bpc.daw.mario.*;

/**
 *
 * @author Denis
 */
public class MarioPreba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mario m1, m2 = null;
        Luigi l1, l2 = null;
        Seta s1 = null;
        Planta p1, p2, p3 = null;
        Disparo d1 = null;
        Cañon c1 = null;
        //metodo constructor
       // m1 = new Mario();
        
        // constructor con parametros
    m2 = new Mario(640, 320);
    m2.saltar();
    
    l1 = new Luigi(500);
    double distanciaL = l1.getDistanciaOrigen();
    System.out.println("Luigi esta en esta distancia: "+distanciaL);
    m1 = new Mario(50,25);
    double distanciaX = m1.getX();
    double distanciaY = m1.getY();
    double distanciaM1 = distanciaX + distanciaY;
    System.out.println("Mario esta en esta distancia: "+distanciaM1);
    
    
    l2 = new Luigi(m2,50);
    
    s1 = new Seta(1000, 0);
    s1.andarHacia(0, 0);
    
    p1 = new Planta(400,500);
    p1.comer(true);
    
    p2 = new Planta(450,500);
    p2.comer(true);
    
    p3 = new Planta(500,500);
    p3.comer(true);
    
    c1 = new Cañon (100, 320);
    c1.disparar(690, 320);
    
    





    }
    
}
