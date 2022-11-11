package ejercicio18;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Denis
 */
public class Ejercicio18 {

   
    public static void main(String[] args) {
        
      System.out.println("Introduce tu correo");
      String correo = new Scanner(System.in).nextLine();  
        
      int n = correo.indexOf("@");
      String nombre = correo.substring(0,n);
      String dominio = correo.substring(n+1,correo.length());
      
      System.out.println("Tu nombre es: "+nombre);
      System.out.println("Tu dominio es: "+dominio);  
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
