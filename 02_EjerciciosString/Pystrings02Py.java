package pystrings02.py;
import java.util.*;
/**
 *
 * @author Denis
 */
public class Pystrings02Py {

    
    public static void main(String[] args) {
       
       System.out.println("Escribe lo que quiera con espacios y se leeran solo los 50 primeros caracteres ");
       String frase = new Scanner(System.in).nextLine();
        
       String SinEspacios = frase.replaceAll("\\s+","");
       
       System.out.println(SinEspacios.substring(0, 50));
        
        
        
        
        
        
        
    }
    
}
