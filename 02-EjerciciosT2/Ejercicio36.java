package ejercicio36;

/**
 *
 * @author Denis <denis.stupak23@gmai.com>
 */
public class Ejercicio36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double res;
        
        res = Math.sqrt(150);
        System.out.println("Raiz cuadrada de 150 = "+res);
        
        res = Math.pow(2, 9)/ Math.log(6);
        System.out.println("2^9 / log 6 = "+res);
        
        res =  Math.cos(0.16);
        System.out.println("Coseno de 0.16 radianes = "+res);
        
        res = Math.sin(Math.toRadians(45));
        System.out.println("Seno de 45 grados = "+res);

    }

}
