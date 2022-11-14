package pystring07;
import java.util.*;
/**
 *
 * @author Denis
 */
public class Pystring07 {

  
    public static void main(String[] args) {
        
        System.out.println("Pon una cadena de minimo 4 posiciones con un maximo de 10: ");
        String cadena = new Scanner(System.in).nextLine();
        
           
       if(cadena.length()>10 || cadena.length()<=3){
           System.out.println("La cadena que has puesto no esta en el rango");
       }else{
             
            StringBuilder cadena1 = new StringBuilder(cadena);
            char guardado;
      
            guardado= cadena.charAt(0);
            cadena1.deleteCharAt(0).insert(0,cadena.charAt(1));
            cadena1.deleteCharAt(1).insert(1, guardado);
         
            guardado= cadena.charAt(2);
            cadena1.deleteCharAt(2).insert(2,cadena.charAt(3));
            cadena1.deleteCharAt(3).insert(3, guardado);
      
            if(cadena.length()>=6){
               guardado = cadena.charAt(4);
               cadena1.deleteCharAt(4).insert(4, cadena.charAt(5));
               cadena1.deleteCharAt(5).insert(5, guardado);
            }
            
            if(cadena.length()>=8){
               guardado = cadena.charAt(6);
               cadena1.deleteCharAt(6).insert(6, cadena.charAt(7));
               cadena1.deleteCharAt(7).insert(7, guardado);
            }
            
            if(cadena.length()==10){
            guardado = cadena.charAt(8);
            cadena1.deleteCharAt(8).insert(8, cadena.charAt(9));
            cadena1.deleteCharAt(9).insert(9, guardado);
            }
          
            System.out.println(cadena1);    
          
        }           
    }
    }
    

