package pystring08;
import java.util.*;
/**
 *
 * @author Denis
 */
public class Pystring08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escribe tu nombre completo");
        String nombre = new Scanner(System.in).nextLine();
        
        int auxiliar=0, numero=0;
        String primero="", segundo="", tercero="", cuarto="", imprimir="";
        
        numero  = nombre.indexOf(" ");
        if(numero == -1){
           primero = nombre.substring(0,nombre.length()); 
        }else{
        primero = nombre.substring(0, numero);
        auxiliar = numero+1;
        }
        
        if(auxiliar != 0){
        numero = nombre.indexOf(" ", auxiliar);
        if(numero == -1 ){
            segundo = nombre.substring(auxiliar,nombre.length());
            auxiliar=0;
        }else{
             segundo = nombre.substring(auxiliar, numero);
             auxiliar = numero+1;     
        }
        }   
        
        if(auxiliar !=0){
        numero = nombre.indexOf(" ", auxiliar);
        if(numero == -1){
            tercero = nombre.substring(auxiliar,nombre.length());
            auxiliar = 0;
        }else{
             tercero = nombre.substring(auxiliar, numero);
             auxiliar = numero+1;
        }
        }
        
        if(auxiliar != 0){
        cuarto = nombre.substring(auxiliar,nombre.length());
        }
        
        if(cuarto.length() == 0 && tercero.length()==0){
            System.out.println(imprimir=segundo+", "+primero.toUpperCase().charAt(0)+".");
        }else{
            if(cuarto.length() == 0){
                System.out.println(imprimir=segundo+" "+tercero+", "+primero.toUpperCase().charAt(0)+".");
            }else{
                System.out.println(imprimir=tercero+" "+cuarto+", "+primero.toUpperCase().charAt(0)+". "+segundo.toUpperCase().charAt(0)+".");  
            }
        }
    }
    
}
