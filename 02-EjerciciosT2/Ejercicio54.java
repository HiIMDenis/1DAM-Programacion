package ejercicio54;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Denis <denis.stupak23@gmai.com>
 */
public class Ejercicio54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       // Crear lista
        ArrayList<String> lista = new ArrayList<>();
        lista.add("gato");
        lista.add("perro");
        lista.add("caballo");
        lista.add("elefante");
        lista.add("conejo");
        lista.add("pájaro");
        lista.add("serpiente");
        lista.add("tigre");
        lista.add("leon");
        lista.add("jirafa");   

        // Mostrar salida del método toString de la lista
        System.out.println("Lista original: "+lista.toString());
        
        // Ordenar la lista usando el método sort de la clase Collections
        Collections.sort(lista);
        
        // Mostrar salida del método toString de la lista ordenada
        System.out.println("Lista ordenada: "+lista.toString());








    }

}
