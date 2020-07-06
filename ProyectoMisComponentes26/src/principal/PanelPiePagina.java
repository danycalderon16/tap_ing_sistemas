/*
 *Daniel Alejandro Calderón Virgen 
 *No Lista 26
 *12:00 - 13:00 hrs 
 *18-02-2020
 */
package principal;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelPiePagina extends JPanel{
    
    JLabel logoSep;
    JLabel direccion;
    
    public PanelPiePagina() {
        logoSep = new JLabel();
        this.logoSep.setIcon(new ImageIcon(("C:\\Users\\dayae\\Documents\\NetBeansProjects\\ProyectoMisComponentes26\\src\\img\\logoSep.jpg")));
        this.add(logoSep);
        this.setBackground(Color.BLUE);
        this.setForeground(Color.white);
    }
    
    
    
}
