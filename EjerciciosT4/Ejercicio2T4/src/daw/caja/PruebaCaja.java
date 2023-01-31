package daw.caja;

import daw.caja.box;

/**
 *
 * @author Denis
 */
public class PruebaCaja {

    public static void main(String[] args) {
        box caja1 = new box();

        box caja2 = new box("VIVA EL TEMA 7");

        caja2.Getabierto();
        System.out.println(caja2.Getmensaje());
        System.out.println(caja2.ToString());

        box caja3 = new box("VIVA EL TEMA 7");

        if (false) {

            System.out.println(caja3.ToString());
        }
    }
}
