package daw.persona;
import daw.persona.DNI;
/**
 *
 * @author Denis
 */
public class PruebaEje1T4 {
    
    public static void main(String[] args) {
    
        DNI DNI=new DNI("12345678Z");
    
        System.out.println(DNI.GetLetter());
        System.out.println(DNI.GetNumero());
    
    }
}
