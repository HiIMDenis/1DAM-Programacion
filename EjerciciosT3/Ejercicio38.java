package ejercicio38;

/**
 *
 * @author Denis <denis.stupak23@gmai.com>
 */
public class Ejercicio38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Calcular las dos soluciones de x^2 ? 5? + 6\n");
        double r1, r2;
        int a = 1, b = -5, c =6;
        
        double Dis;
        Dis = Math.sqrt(Math.pow(b, 2)-4*a*c);
        
        if(Dis > 0){
            System.out.println("Tiene dos soluciones:\n");
            
            r1= (-1*b + Math.sqrt(Math.pow(b, 2)-4*a*c))/2.0*a;
            r2= (-1*b - Math.sqrt(Math.pow(b, 2)- 4*a*c))/2.0*a;
            
            System.out.println("Solución 1 = "+r1);
            System.out.println("Solucion 2 = "+r2);
            
        }else{
               if(Dis == 0){
                  System.out.println("Tiene una solucion:\n");
                
                  r1= (-1*b + Math.sqrt(Math.pow(b, 2)-4*a*c))/2.0*a;
                  System.out.println("Solución 1 = "+r1);   
               }else{
                      System.out.println("No tiene solución");
                     }
             } 
        

    }

}
