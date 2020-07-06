/*Edgar Rojas Medina
 *Daniel Alejandro Calderón Virgen 
 *No Lista 16 y 26 
 *12:00 - 13:00 hrs 
 *28-02-2020
 */
package Clases;

import static Clases.Utils.blanco;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Calderon
 */
public class Main extends JFrame{

    private JPanel encabezado;
    private JPanel body;
    private JPanel piePagina;
    public Main() throws HeadlessException {
        this.setSize(1000, 800);
        this.setBackground(blanco);
        //this.setLayout(new GridLayout(3, 1));
        //this.setLayout(new GridBagLayout());
       
        
        encabezado = new PanelEncabezado();
        encabezado.setSize(1000, 90);
        add(encabezado);
        
        body = new PanelPrincipal();
        body.setSize(1000, 380);
        add(body);
        
        piePagina = new PanelPiePagina();
        piePagina.setSize(1000, 90);
        add(piePagina);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    
    public static void main(String[] args) {
        new Main().setVisible(true);
    }
    
}
