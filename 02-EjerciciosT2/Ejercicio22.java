package ejercicio22;
import bpc.daw.objetos.*;
import java.lang.Exception;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Denis
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TarjetaCredito t = new TarjetaCredito(5000, 1111);
             
       try{
         System.out.println("Tu saldo disponible es de: "+t.getSaldo(1111)+" euros");
         
         System.out.println("Cuanto dinero desea sacar?");
         int s = new Scanner(System.in).nextInt();
         
         System.out.println("Introduce la contrasena");
         int p = new Scanner(System.in).nextInt();
         t.sacarDinero(s, p);
         
         System.out.println("Tu saldo disponible es de: "+t.getSaldo(1111)+" euros");
       }catch(Exception e){
        System.out.println("La contrasena es incorrecta");
    }
       
        
        
        
    }
    
}
