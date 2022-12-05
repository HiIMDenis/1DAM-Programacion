package ejercicio51;
import java.util.*;
/**
 *
 * @author Denis <denis.stupak23@gmai.com>
 */
public class Ejercicio51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         // Crea un conjunto de mensajes
        Set<String> mensajes = new HashSet<String>();
        
        // Rellena el conjunto con las palabras especificadas
        mensajes.add("silla");
        mensajes.add("mesa");
        mensajes.add("niño");
        mensajes.add("mesa");
        mensajes.add("casa");
        mensajes.add("silla");
        mensajes.add("lapiz");
        
        // Muestra el tamaño del conjunto
        System.out.println("Tamaño del conjunto: " + mensajes.size());
        
        // Muestra el contenido del conjunto
        System.out.println(mensajes.toString());
        









    }

}
