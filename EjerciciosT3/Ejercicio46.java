package ejercicio46;
import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author Denis <denis.stupak23@gmai.com>
 */
public class Ejercicio46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Random r = new Random();
        int segundos = ThreadLocalRandom.current().nextInt(0, 10 + 1);
        System.out.println("Duracion de la pausa: " + segundos + " segundos");

        Instant inicioPausa = Instant.now();
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Instant finPausa = Instant.now();
        Duration duracion = Duration.between(inicioPausa, 
                finPausa);

        System.out.println("La duracion de la pausa fue de: "
                +duracion.getSeconds()+" segundos");

    }

}
