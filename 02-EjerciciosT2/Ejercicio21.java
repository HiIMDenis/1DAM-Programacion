package ejercicio21;
import java.util.*;
import java.io.*;
/**
 *
 * @author Denis
 */
public class Ejercicio21 {

    
    public static void main(String[] args) {
        
        System.out.println("Pon la ruta de un directorio");
        String ndirectorio = new Scanner(System.in).nextLine();
        
        File ruta = new File(ndirectorio);
        
        if(ruta.isDirectory()){
           File lista[] = ruta.listFiles();  
           System.out.println("Numero total de archivos y carpetas: "+lista.length); 
        }else{
            System.out.println("Error no es un directorio");
             }
        
        
        
        
        
        
        
        
    }
    
}
