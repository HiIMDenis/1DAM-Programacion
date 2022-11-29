package ejercicio44;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
    
    DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    
    System.out.println("Fecha actual en formato dia/mes/ano: "
            +fechaActual.format(formato1));
   
    System.out.println("Fecha actual en formato dia-mes-ano: "
            +fechaActual.format(formato2));
  }
}









    }

}
