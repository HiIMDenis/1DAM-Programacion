package daw.persona;

/**
 *
 * @author Denis
 */
public class DNI {

    private int numero;
    private char letra;

    public DNI(int num, char l) {

        numero = num;
        letra = l;
    }

    public DNI(String dni) {

        letra = dni.charAt(8);
        numero = Integer.parseInt(dni.substring(0, 8));
    }

    public int GetNumero() {
        return numero;
    }
    
  public char GetLetter() {
        return letra;
    }
;

}
