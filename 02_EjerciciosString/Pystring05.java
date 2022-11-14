package pystring05;
import java.util.*;
/**
 *
 * @author Denis
 */
public class Pystring05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Pon una frase para ver si es palíndromo");
        String frase = new Scanner(System.in).nextLine();
        
        frase= frase.toLowerCase().replace("á","a").replace("é", "e")
        .replace("í", "i").replace("ó", "o").replace("ú", "u")
        .replace(" ", "").replace(".", "").replace(",", "");
        
        StringBuilder inverC = new StringBuilder(frase);
        
        String inver = inverC.reverse().toString();
        
        if(inver.equals(frase)){
            System.out.println("La frase si es un palíndromo");
        }else{
            System.out.println("La frase no es un palíndromo");
        } 
    }
    }
    

