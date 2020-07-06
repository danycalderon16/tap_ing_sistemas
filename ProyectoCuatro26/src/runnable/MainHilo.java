
package runnable;

/**
 *
 * @author Calderon
 */
public class MainHilo {
    
    private static int IMPAR = 2001;
    private static int PAR = 2002;
    
    public static void main(String[] args) {
        
        System.out.println("Proyecto con Runnable");
        
        Hilo hiloImpar = new Hilo("Impar", 30, IMPAR);
        Hilo hiloPar = new Hilo("Par", 30, PAR);
      
        Thread hiloI = new Thread(hiloImpar);
        Thread hiloP = new Thread(hiloPar);
        
        hiloI.start();
        hiloP.start();
    }
    
}
