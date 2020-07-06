
import static javax.swing.JOptionPane.*;

/**
 *
 * @author Calderon
 */
public class PrimerHilo_26 implements Runnable {

    String nombreHilo;

    public PrimerHilo_26(String nombreHilo) {
        this.nombreHilo = nombreHilo;
    }//PrimerHilo
    
    
    
    
    @Override
    public void run() {
        System.out.println("Primer Hilo por"+nombreHilo);
        
        try {
            for (int contar = 0; contar < 10; contar++) {
                Thread.sleep(400);
                System.out.println("En "+nombreHilo+", el recuenteo "+contar);
            }//try
        } catch (InterruptedException e) {
            System.out.println(nombreHilo+" Interrumpido...");
        }//cathc
        System.out.println("Terminado "+nombreHilo);
    }//run
    
    
}
