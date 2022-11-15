package ejercicio24;
import java.util.*;
import java.io.*;

/**
 *
 * @author Denis
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String frase1,frase2;
        Scanner s=new Scanner(System.in);
        System.out.println("Introduce la primera frase: ");
        frase1=s.nextLine();
        
        System.out.println("Introduce la segunda frase: ");
        frase2=s.nextLine();
        
        PrintWriter pw=null;
        
        try{
            pw=new PrintWriter(new FileWriter("e:/frase.txt"));
            pw.println(frase1);
            pw.println(frase2);
        }catch(java.io.IOException e){
            System.out.println("Error: "+e.getMessage());
        }finally{
            if(pw!=null){
                pw.close();
            }
        }
    
     
        
        
        
        
        
        
        
        
        
        
    }
    
}
