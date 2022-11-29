package ejercicio44;
import java.time.LocalDate;
/**
 *
 * @author Denis <denis.stupak23@gmai.com>
 */
public class Ejercicio44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    LocalDate fechaActual = LocalDate.now();  
		
    String diaMesAno = fechaActual.toString();
    String diaMesAno2 = diaMesAno.replace("-", "/");
		
    System.out.println("Fecha actual en formato día/mes/año: " + diaMesAno2);
    System.out.println("Fecha actual en formato día-mes-año: " + diaMesAno);
        









    }

}
