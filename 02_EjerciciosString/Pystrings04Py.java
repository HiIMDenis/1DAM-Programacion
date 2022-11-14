package pystrings04.py;
import java.util.*;
/**
 *
 * @author Denis
 */
public class Pystrings04Py {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Pon una palabra de maximo 5 letras para codificarlo ");
        String cadena = new Scanner(System.in).nextLine();
        
        if(cadena.length()>5){
            System.out.println("Te has pasado, solo 5 letras eh dicho :< ");
        }else{
        
        
           System.out.println("Pon un grado de codificación (1 a 100 maximo) ");
           int grado = new Scanner(System.in).nextInt();
        
           if(grado>100){
              System.out.println("Ahora te has pasado con esto... maximo 100 grados");
           }else{
            
              char uno=0, dos=0, tres=0, cuatro=0, cinco=0;
              String codificado="";
        
              if(cadena.length() >= 1){
                 uno    = cadena.charAt(0);
                 uno    += grado;
                 codificado ="codificado: "+uno;    
              }
              
              if(cadena.length() >= 2){
                 dos    = cadena.charAt(1);
                 dos    += grado;
                 codificado ="codificado: "+uno+dos;
              }
              
              if(cadena.length() >= 3){
                tres   = cadena.charAt(2);
                tres   += grado;
                codificado ="codificado: "+uno+dos+tres;
              }
              
              if(cadena.length() >= 4){
                 cuatro = cadena.charAt(3);
                 cuatro += grado;
                 codificado ="codificado: "+uno+dos+tres+cuatro;    
              }
              
              if(cadena.length() == 5){
                 cinco  = cadena.charAt(4);
                 cinco  += grado;
                 codificado ="codificado: "+uno+dos+tres+cuatro+cinco;
              } 
                        
              System.out.println(codificado); 
              
            }
        }
    }
    
    
}
