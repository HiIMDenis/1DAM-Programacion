package ejercicio17;
import java.util.*;

public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      System.out.println("Introduce tu nombre");
      String nombre = new Scanner(System.in).nextLine();
        
      System.out.println("Introduce tu dominio");
      String dominio = new Scanner(System.in).nextLine();  
      
      if (dominio.endsWith(".es")|| dominio.endsWith(".com")){
          String correo = nombre+"@"+dominio;
          System.out.println("Tu correo es: "+correo);
      }else{
          System.out.println("El dominio es incorrecto");
      }
      
        
        
        
        
        
        
    }
    
}
