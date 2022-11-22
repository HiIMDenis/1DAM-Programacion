

package test;

/**
 *
 * @author Denis <denis.stupak23@gmai.com>
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String nombreSO = "os.name";
        String versionSO = "os.version";
        String arquitecturaSO = "os.arch";
        String pathSO = "java.class.path";
        String homeSO = "java.home";
        String vendorSO = "java.vendor";
        String vendorUrlSO = "java.vendor.url";
        String javaVersion = "java.version";
        String dirSO = "user.dir";
        String homeSo = "user.home";
        String nameSO = "user.name";
        
        
        
        
        
        System.out.println("\n Informacion sobre el SO: ");
        System.out.println("\nNombre del SO: "+System.getProperty(nombreSO));
        System.out.println("Version del SO: "+System.getProperty(versionSO));
        System.out.println("Arquitectura del SO: "+System.getProperty(arquitecturaSO));
        System.out.println("Path del SO: "+System.getProperty(pathSO));
        System.out.println("home del SO: "+System.getProperty(homeSO));
        System.out.println("Vendor: "+System.getProperty(vendorSO));
        System.out.println("Vendor url: "+System.getProperty(vendorUrlSO));
        System.out.println("Version Java: "+System.getProperty(javaVersion));
        System.out.println("Dir del SO: "+System.getProperty(dirSO));
        System.out.println("Home del SO: "+System.getProperty(homeSO));
        System.out.println(" del SO: "+System.getProperty(nameSO));




    }

}
