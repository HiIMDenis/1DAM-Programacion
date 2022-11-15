package ejercicio23;
import bpc.daw.objetos.*;
import java.lang.Exception;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Denis
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        TarjetaCredito t = new TarjetaCredito(1000, 2222);
        
        try{
             System.out.println("Tu saldo disponible es de: "+t.getSaldo(2222)+" euros");
             
             System.out.println("Cuanto dinero desea ingresar");
                int d = new Scanner(System.in).nextInt();
                t.ingresarDinero(d);
             
             System.out.println("Tu saldo disponible es de: "+t.getSaldo(2222)+" euros");
             
             System.out.println("Cuanto dinero desea sacar?");
                int s = new Scanner(System.in).nextInt();
            
             System.out.println("Introduce la contrasena");
                int p = new Scanner(System.in).nextInt();
                t.sacarDinero(s, p);
            
             System.out.println("Tu saldo disponible es de: "+t.getSaldo(2222)+" euros");
        }catch(Exception e){
            System.out.println("La contrasena es incorrecta");
        }
       
       
        
    }
    
}
