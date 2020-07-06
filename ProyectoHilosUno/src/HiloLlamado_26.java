import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.*;

/**
 *
 * @author Calderon
 */
public class HiloLlamado_26 {
    
    public static void main(String[] args) {
        System.out.println("Hilo <main> iniciando...");
        
        //Creacion del objeto de la interfaz Runnable
        PrimerHilo_26 hilo = new PrimerHilo_26("TAP-Hilo 1");
        
        //Crear un hilo Runnable haciendo uso de la clase Thread
        Thread nuevoHilo = new Thread(hilo);
        
        //Como se estudio el metodo start inicia el hilo en ejecución
        nuevoHilo.start();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("<<Dentro del hilo principal>>");
        }//for
        try {
            Thread.sleep(100);//Dormir hilo 100 milisegundos
        }//try 
        catch (InterruptedException ex) {
            System.out.println("Hilo principal interrumpido...");
        }//catch
        
        System.out.println("Hilo principal finalizado");
        
    }//main
    
}
