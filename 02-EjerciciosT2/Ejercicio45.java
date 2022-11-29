package ejercicio45;
import java.time.LocalDate;
import java.time.DayOfWeek;
/**
 *
 * @author Denis <denis.stupak23@gmai.com>
 */
public class Ejercicio45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      LocalDate fecha = LocalDate.of(2100, 2, 28);
      DayOfWeek dia = fecha.getDayOfWeek();
      System.out.println("El dia es: " + dia);










    }

}
