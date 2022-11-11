package ejercicio11;
import bpc.daw.objetos.*;
/**
 *
 * @author Denis
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Caja c1 = new Caja("Mensaje 1");
        Caja c2 = new Caja("Mensaje 2");
        
        c1.abrirCaja();
        c2.abrirCaja();
        
        String m1 = c1.getMensaje();
        String m2 = c2.getMensaje();
        System.out.println("Caja 1: "+m1);
        System.out.println("Caja 2: "+m2);
        
        c1.cambiarMensaje(m2);
        c2.cambiarMensaje(m1);
        
        m1 = c1.getMensaje();
        m2 = c2.getMensaje();
        
        System.out.println("Caja 1: "+m1);
        System.out.println("Caja 2: "+m2);
        
        
        
    }
    
}
