package daw.caja;

/**
 *
 * @author Denis
 */
public class box {

    private boolean abierto;
    private String mensaje;

    public box() {
    }

    ;
    
    public box(String m) {
        mensaje = m;
    }

    public box(Boolean a, String m) {
        abierto = a;
        mensaje = m;
    }

    public boolean Getabierto() {
                    
        return abierto;
    }

    public String Getmensaje() {

        return mensaje;
    }

    public String ToString() {

        String aux;

        if (abierto) {

            aux = "El mensaje de la caja es " + mensaje;
        } else {

            aux = "La caja esta cerrada";
        }

        return aux;
    }
}
