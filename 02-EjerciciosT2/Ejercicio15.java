package ejercicio15;
import java.util.*;
/**
 *
 * @author Denis
 */
public class Ejercicio15 {

    
    public static void main(String[] args) {
                
      String Clave = "Password";
      
      System.out.println("Introduce una password");
      String password = new Scanner(System.in).nextLine();
      
      System.out.println("Coincide la password? "+password.equals(Clave));
        
        
        
        
    }
    
}
