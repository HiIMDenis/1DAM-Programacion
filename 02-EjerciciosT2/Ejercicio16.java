package ejercicio16;
import java.util.*;
/**
 *
 * @author Denis
 */
public class Ejercicio16 {

    
    public static void main(String[] args) {
        
      System.out.println("Introduce la primera frase");
      String frase1 = new Scanner(System.in).nextLine();
        
      System.out.println("Introduce la segunda frase");
      String frase2 = new Scanner(System.in).nextLine();  
      
      int f1 = frase1.indexOf(frase2);
        
      if (f1 == -1){
          System.out.println("El texto 2 esta incluido en el texto 1? False");
      }else{
          System.out.println("El texto 2 esta incluido en el texto 1? true");
      }
        
        
        
    }
    
}
