package ejerep6;

/**
 *
 * @author Denis
 */
public class EjeRep6 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("tres-cinco");
            } else if (i % 3 == 0) {
                System.out.println("tres");
            } else if (i % 5 == 0) {
                System.out.println("cinco");
            } else {
                System.out.println(i);
            }
        }

    }
}
