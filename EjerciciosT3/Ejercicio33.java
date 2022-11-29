package ejercicio33;
import bpc.daw.reproductor.*;
import java.util.*;

/**
 *
 * @author Denis <denis.stupak23@gmai.com>
 */
public class Ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ArchivoMP3 c1 = new ArchivoMP3("C:/Users/ADMIN/Desktop/Programacion/Tema2/musica/Red.mp3");
        ArchivoMP3 c2 = new ArchivoMP3("C:/Users/ADMIN/Desktop/Programacion/Tema2/musica/MyHead.mp3");
        ArchivoMP3 c3 = new ArchivoMP3("C:/Users/ADMIN/Desktop/Programacion/Tema2/musica/MiMiMi.mp3");


        PlayList lista = new PlayList();
        
        lista.añadir(c1);
        lista.añadir(c2);
        lista.añadir(c3);
        
        lista.setTitulo("Canciones Chingonas wey");
        
        try {
            lista.guardar("C:/Users/ADMIN/Desktop/Programacion/Tema2/musica/ListaDeEjemplo.txt");
            Reproductor r = new Reproductor(lista, true, false);
            r.play();
            } catch (Exception e) {
            e.getMessage();
        }

    }

}
