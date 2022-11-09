package ejercicio07;
import bpc.daw.mario.*;
import bpc.daw.objetos.*;
/**
 *
 * @author Denis
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        DepositoAgua dep1 = null;
        dep1 = new DepositoAgua(15, 50);
        dep1.dibujar();
        dep1.getCapacidadMaxima();
        dep1.getCantidadActual();
        
        double porcentaje;
        porcentaje = (15 * 100) / 50;
        System.out.println("El porcentaje es "+porcentaje+" %");
        
        
        
        
    }
    
}
