

package ejercicio34;
import bpc.daw.reproductor.*;
import java.io.IOException;
/**
 *
 * @author Denis <denis.stupak23@gmai.com>
 */
public class Ejercicio34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

    try{
        PlayList list = new PlayList("C:/Desktop/Programacion/Tema2/musica");
           Reproductor r = new Reproductor(list,true,false);
           r.play();
        
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }

}
