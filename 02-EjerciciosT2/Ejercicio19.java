package ejercicio19;
import java.util.*;
import java.io.*;
/**
 *
 * @author Denis
 */
public class Ejercicio19 {

    
    public static void main(String[] args) {
        
       System.out.println("Dime la ruta de un archivo");
       String nruta = new Scanner(System.in).nextLine(); 
        
       File ruta = new File(nruta); 
        
       System.out.println("Tiene: "+ruta.length()+(" bytes"));
       System.out.println("Tiene: "+(ruta.length()*1.0/1024)/1024+(" Megabytes")); 
        
        
        
        
    }
    
}
