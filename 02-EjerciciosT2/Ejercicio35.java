package ejercicio35;
import bpc.daw.reproductor.*;
/**
 *
 * @author Denis <denis.stupak23@gmai.com>
 */
public class Ejercicio35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      ArchivoMP3 c1 = new ArchivoMP3("C:Users/ADMIN/Desktop/Programacion"
          + "/Tema2/musica/Believe.mp3");
      ArchivoMP3 c2 = new ArchivoMP3("C:Users/ADMIN/Desktop/Programacion"
          + "/Tema2/musica/Red.mp3");
      
      boolean i = c1==c2;
      System.out.println("comparación con == es: "+i);
        
        i =  c1.equals(c2);
        System.out.println("comparación con equals "+i);
        
        System.out.println("HashCode de c1 "+c1.hashCode());
        System.out.println("HashCode de c2 "+c2.hashCode());
        
        i = c1.hashCode() == c2.hashCode();
        System.out.println("Son iguales los HashCode: "+i+"\n");
        
        Reproductor r = new Reproductor(c1,true,true);
        System.out.println("Metodo toString a Reproductor: "+r.toString());
        
        System.out.println("Metodo toString a ArchivoMP3: "+c1.toString());
        System.out.println("La clase ArchivoMP3 tiene la clase reprogramada");


    }

}
