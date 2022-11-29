package ejercicio47;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Denis <denis.stupak23@gmai.com>
 */
public class Ejercicio47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la ruta del archivo: ");
        String ruta = sc.nextLine();
        sc.close();

        File miArchivo = new File(ruta);
        
        if(miArchivo.exists()) {
            try {
                Desktop.getDesktop().open(miArchivo);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("El archivo no existe");
        }
    }
    }

