package reproductormusica;
import java.util.Scanner;
import bpc.daw.reproductor.ArchivoMP3;
import bpc.daw.reproductor.Reproductor;
import java.lang.Object;
import bpc.daw.musica.*;


/**
 *
 * @author Denis <denis.stupak23@gmai.com>
 */
public class ReproductorMusica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Cancion c = new Cancion("Cancion");
        
        NotaMusical n1 = new NotaMusical(0, 2);
        c.añadir(n1);
        
        NotaMusical n2 = new NotaMusical(4, 1);
        c.añadir(n2);
        
        NotaMusical n3 = new NotaMusical(3, 2);
        c.añadir(n3);
        
        NotaMusical n4 = new NotaMusical(1, 1);
        c.añadir(n4);
        
        NotaMusical n5 = new NotaMusical(0, 4);
        c.añadir(n5);
        
        NotaMusical n6 = new NotaMusical(5, 3);
        c.añadir(n6);
        
        NotaMusical n7 = new NotaMusical(2, 2);
        c.añadir(n7);
        
        NotaMusical n8 = new NotaMusical(1, 8);
        c.añadir(n8);

        Piano p = new Piano();
        p.reproducir(c);
        
        Guitarra g = new Guitarra();
        g.reproducir(c);




    }
}

