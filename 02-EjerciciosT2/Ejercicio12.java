package ejercicio12;
import bpc.daw.objetos.*;
/**
 *
 * @author Denis
 */
public class Ejercicio12 {

    
    public static void main(String[] args) {
        
    MarcadorBaloncesto mb = new MarcadorBaloncesto("Estudiantes", "Cb Granada");
    mb.anotarCanasta('L', 2);
    mb.anotarCanasta('V', 3);
    mb.anotarCanasta('L', 2);
    mb.anotarCanasta('V', 2);
    mb.anotarCanasta('V', 3);
    mb.anotarCanasta('L', 1);
    mb.anotarCanasta('L', 1);
    mb.anotarCanasta('V', 2);
    
    System.out.println(mb.toString());
    
    System.out.println("Ganando "+mb.getNombreEquipoGanador());
    System.out.println("perdiendo "+mb.getNombreEquipoPerdedor());
        
        
        
        
    }
    
}
