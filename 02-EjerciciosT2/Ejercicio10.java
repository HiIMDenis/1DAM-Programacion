package ejercicio10;
import bpc.daw.objetos.*;
/**
 *
 * @author Denis
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Caja c1 = new Caja("Mensaje cualquiera"); 
        c1.abrirCaja();
        String m1 = c1.getMensaje();
        
        System.out.println("El mensaje es "+m1);
        
        
        c1.cambiarMensaje("Este es el mensaje cambiado");
        m1 = c1.getMensaje();
 
        System.out.println("El mensaje es "+m1);
      
        
        
        
        
        
        
        
        
    }
    
}
