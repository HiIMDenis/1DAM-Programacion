package ejercicio52;
import java.awt.Color;
import java.util.*;
/**
 *
 * @author Denis <denis.stupak23@gmai.com>
 */
public class Ejercicio52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    // Creamos un objeto HashMap para almacenar las asociaciones
    // entre matrículas y colores de coches
    Map<String, Color> coches = new HashMap<>();
    
     // Añadimos algunas asociaciones a nuestro objeto HashMap
    coches.put("12535ABC", Color.RED);
    coches.put("98525KWX", Color.YELLOW);
    coches.put("17632MSE", Color.GREEN);
    coches.put("85321ABC", Color.YELLOW);
    
     // Mostramos el tamaño del map
    System.out.println("Tamaño del map: "+coches.size());
    
    // Mostramos el contenido del map utilizando su método toString()
    System.out.println("Contenido del map: "+coches);
    
    // Pedimos al usuario que introduzca la matrícula de un coche
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce la matrícula de un coche: ");
    String matricula = scanner.nextLine();
    
     // Comprobamos si la matrícula introducida existe en el map
    if (coches.containsKey(matricula)) {
      // Si existe, mostramos el color del coche
      System.out.println("El color del coche con matricula "+matricula+" es "
              +coches.get(matricula));
    } else {
      // Si no existe, mostramos un mensaje
      System.out.println("No existe esa matricula");
    }
    }

}
