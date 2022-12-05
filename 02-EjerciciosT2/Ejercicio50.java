package ejercicio50;
import java.util.*;
/**
 *
 * @author Denis <denis.stupak23@gmai.com>
 */
public class Ejercicio50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        List<String> mensajes = new ArrayList<>();
        
        // Rellene la lista con 5 palabras (las que tú quieras)
        mensajes.add("Hola");
        mensajes.add("Amigo");
        mensajes.add("Teraza");
        mensajes.add("Coco");
        mensajes.add("Nuevo");
        
        // Muestre por pantalla el tamaño de la lista
        System.out.println("El tamaño de la lista es: " + mensajes.size());
        
        // Muestre por pantalla la palabra de la posición 3 de la lista.
        System.out.println("La palabra en la posicion 3 es: " + mensajes.get(2));
        
        // Llame al método toString de la lista y muestre por pantalla lo que produce
        System.out.println("La lista es: " + mensajes.toString());
        
        // Elimine el primer dato de la lista
        mensajes.remove(0);
        
        // Muestre el tamaño de la lista
        System.out.println("El tamaño de la lista es: " + mensajes.size());
        
        // Muestre por pantalla la palabra de la posición 3 de la lista
        System.out.println("La palabra en la posicion 3 es: " + mensajes.get(2));
        
         // Llame al método toString de la lista y muestre por pantalla lo que produce
        System.out.println("La lista es: " + mensajes.toString());
        
        












    }

}
