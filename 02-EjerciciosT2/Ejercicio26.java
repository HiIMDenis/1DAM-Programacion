package ejercicio26;
import java.util.*;
import java.io.*;
/**
 *
 * @author Denis
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Cuantos segundos desea esperar?");
        int sec = new Scanner(System.in).nextInt();
        
        try{
            Thread.sleep(sec*1000);
        }catch (InterruptedException ex){
            System.out.println("Error");
        }
        System.out.println("Programa Finalizado");
        
      
    }     
    }
    

