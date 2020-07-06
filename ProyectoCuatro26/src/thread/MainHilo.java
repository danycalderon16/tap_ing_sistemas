
package thread;

/**
 *
 * @author Calderon
 */
public class MainHilo {
    
    private static int IMPAR = 2001;
    private static int PAR = 2002;
    
    public static void main(String[] args) {
        
        System.out.println("Proyecto con Thread");
        
        Hilo hiloImpar = new Hilo("Impar", 30, IMPAR);
        Hilo hiloPar = new Hilo("Par", 30, PAR);
        
        hiloImpar.start();
        hiloPar.start();
    }
       
    
}
