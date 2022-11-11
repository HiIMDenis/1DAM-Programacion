package ejercicio09;

import bpc.daw.objetos.Caja;


/**
 *
 * @author Denis
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Caja caja = new Caja("Bienvnido al instituto");
        String mensa = caja.getMensaje();
       
        System.out.println("El mensaje es "+mensa);
        
        caja.abrirCaja();
        
        mensa = caja.getMensaje();
        System.out.println("El mensaje es "+mensa);
        







    }
    
}
