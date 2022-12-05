package ejercicio48;
import bpc.daw.objetos.*;
import java.util.Scanner;
import bpc.daw.objetos.MarcadorMejorado;

/**
 *
 * @author Denis <denis.stupak23@gmai.com>
 */
public class Ejercicio48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       MarcadorMejorado mm = new MarcadorMejorado("Estudiantes", "BC Granada");
       
       
        System.out.println("Comienza el partido entre "+mm.getNombreLocal()+" y "
                +mm.getNombreVisitante());
        
        mm.anotarCanasta(mm.CANASTA_LOCAL, mm.NORMAL);
        mm.anotarCanasta(mm.CANASTA_VISITANTE, mm.TRIPLE);
        mm.anotarCanasta(mm.CANASTA_LOCAL, mm.NORMAL);
        mm.anotarCanasta(mm.CANASTA_VISITANTE, mm.NORMAL);
        mm.anotarCanasta(mm.CANASTA_VISITANTE, mm.NORMAL);
        mm.anotarCanasta(mm.CANASTA_LOCAL, mm.TIRO_LIBRE);
        mm.anotarCanasta(mm.CANASTA_LOCAL, mm.TIRO_LIBRE);
        mm.anotarCanasta(mm.CANASTA_VISITANTE, mm.NORMAL);

        System.out.println(mm.getNombreLocal()+": "+mm.getPuntosLocal() );
        System.out.println(mm.getNombreVisitante()+": "+mm.getPuntosVisitante()); 
        
        System.out.println("Va ganando " + mm.getNombreEquipoGanador());
        System.out.println("Va perdiendo " + mm.getNombreEquipoPerdedor());
        
        //Prefiero la primera manera porque a la hora de definir los puntos
        //es mas corto pornerlo con el marcador normal.
    }

}
