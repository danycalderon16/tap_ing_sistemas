
package thread;

/**
 *
 * @author Calderon
 */
public class Hilo extends Thread  {
    
    private String nombre;
    private int tope;
    private int tipo;
    
    private int IMPAR = 2001;
    private int PAR = 2002;

    public Hilo(String nombre, int tope, int tipo) {
        this.nombre = nombre;
        this.tope = tope;
        this.tipo = tipo;
    }
    
    
    @Override
    public void run() {
        for (int i = 1; i < tope; i++) {
               if(tipo == IMPAR){
                   if(i%2 == 1)
                       System.out.println(nombre+" - "+i);                   
               }
               if(tipo == PAR){
                   if(i%2 == 0)
                       System.out.println(nombre+" - "+i);                   
               }
        }        
    }
}
