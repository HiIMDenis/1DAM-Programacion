package ejercicio32;
import bpc.daw.reproductor.ArchivoMP3;
import bpc.daw.reproductor.Reproductor;

/**
 *
 * @author Denis <denis.stupak23@gmai.com>
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ArchivoMP3 a = new ArchivoMP3("C:/Users/ADMIN/Desktop/Programacion/Tema2/musica/MiMiMi.mp3");
        
        Reproductor r = new Reproductor(a, true, false);
        
        System.out.println("El titulo de la cancion elegida es: "+a.getTitulo());
        System.out.println("El Autor de la cancion es "+a.getAutor());
        System.out.println("La cancion dura: "+a.getDuracion());

        r.play();

    }

}
