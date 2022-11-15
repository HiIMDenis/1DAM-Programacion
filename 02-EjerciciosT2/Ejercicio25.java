package ejercicio25;
import java.util.*;
import java.io.*;
/**
 *
 * @author Denis
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     try {
         File archivo = new File("e:/frase.txt");
         Scanner sc = new Scanner(archivo);
         
         System.out.println(sc.nextLine());
         System.out.println(sc.nextLine());
         
         sc.close();
     }catch(Exception e) {
         System.out.println("Error al abrir el archivo");
     } 
    }
    
}
