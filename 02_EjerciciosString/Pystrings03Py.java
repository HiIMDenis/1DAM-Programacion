package pystrings03.py;
import java.util.*;
/**
 *
 * @author Denis
 */
public class Pystrings03Py {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce una palabra en Latin y se traducira ");
        String palabra = new Scanner(System.in).nextLine();
        
        StringBuilder traductor = new StringBuilder(palabra);
       
        boolean a = palabra.endsWith("a");
        boolean e = palabra.endsWith("e");
        boolean i = palabra.endsWith("i");
        boolean o = palabra.endsWith("o");
        boolean u = palabra.endsWith("u");
        
        
        if(a||e||i||o||u){ 
        traductor.replace(palabra.length()-1, palabra.length(),"us");
        }else{
        
        traductor.insert(palabra.length(),"us");
        }
        
        System.out.println(traductor);
    }
    
}
