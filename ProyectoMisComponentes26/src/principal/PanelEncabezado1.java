/*Edgar Rojas Medina
 *Daniel Alejandro Calderón Virgen 
 *No Lista 16 y 26 
 *12:00 - 13:00 hrs 
 *28-02-2020
 */
package principal;

import static Clases.Utils.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Calderon
 */
public class PanelEncabezado1 extends JPanel {
    
    
    private JLabel logoTecNM;
    private JLabel logoTecT;
    private JLabel derechos;
    private JLabel titulo;

    public PanelEncabezado1() {    
        this.setLayout(new GridBagLayout());
        this.setPreferredSize(new Dimension(1000, 90));
        this.logoTecNM = new JLabel();
        this.logoTecNM.setText("");
        this.logoTecNM.setIcon(new ImageIcon(this.getClass().getResource("/img/logoTNM.png")));
        add(logoTecNM);
        
        this.titulo = new JLabel();
        this.titulo.setText("Educación Inclusiva");
        this.titulo.setFont(new Font("Monospaced",Font.BOLD,20));
        this.titulo.setBorder(new EmptyBorder(10, 10, 10, 10));
        this.titulo.setForeground(blanco);
        this.add(titulo);
        
        this.logoTecT = new JLabel();
        this.logoTecT.setText("");
        this.logoTecT.setIcon(new ImageIcon(this.getClass().getResource("/img/logo.png")));
        add(logoTecT);
        
        this.derechos = new JLabel();
        this.derechos.setText("Derechos Reservados");
        this.derechos.setBorder(new EmptyBorder(10, 10, 10, 10));
        this.derechos.setFont(new Font("Monospaced",Font.BOLD,16));
        this.add(derechos);
        
        this.setBackground(primaryDark);
              
       
    }
    
}
