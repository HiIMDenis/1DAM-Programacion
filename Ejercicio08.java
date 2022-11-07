package ejercicio08;
import bpc.daw.mario.*;
import bpc.daw.objetos.*;
/**
 *
 * @author Denis
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Deposito 1");
        
        DepositoAgua dep1 = null;
        dep1 = new DepositoAgua(15, 20);
        dep1.dibujar();
        dep1.getCapacidadMaxima();
        dep1.getCantidadActual();
        dep1.retirarLitro();
        dep1.retirarLitro();
        dep1.retirarLitro();
        dep1.retirarLitro();
        dep1.retirarLitro();
        
        System.out.println("Deposito 2");
        
        DepositoAgua dep2 = null;
        dep2 = new DepositoAgua(5, 20);
        dep2.dibujar();
        dep2.getCapacidadMaxima();
        dep2.getCantidadActual();
        
        System.out.println("Deposito 1 Despues");
        
        DepositoAgua dep3 = null;
        dep3 = new DepositoAgua(10, 20);
        dep3.dibujar();
        dep3.getCapacidadMaxima();
        dep3.getCantidadActual();
        
        System.out.println("Deposito 2 Despues");
        
        DepositoAgua dep4 = null;
        dep4 = new DepositoAgua(10, 20);
        dep4.dibujar();
        dep4.getCapacidadMaxima();
        dep4.getCantidadActual();
        
        
    }
    
}
