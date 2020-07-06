/*Edgar Rojas Medina
 *Daniel Alejandro Calderón Virgen 
 *No Lista 16 y 26 
 *12:00 - 13:00 hrs 
 *28-02-2020
 */
package Clases;

import static Clases.Utils.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PanelPiePagina extends JPanel{
    
    JLabel logoSep;
    JLabel direccion;
    JLabel datos;
    JLabel pagina;
    JPanel datosG;
    
    public PanelPiePagina() {
        this.setLayout(new GridBagLayout());
        this.setPreferredSize(new Dimension(1000,90));
        
        this.logoSep = new JLabel();
        this.logoSep.setIcon(new ImageIcon(this.getClass().getResource("/img/logoSep.jpg")));
        this.logoSep.setSize(150, 90);
        this.logoSep.setBorder(new EmptyBorder(0, 10, 10, 10));
        this.setBackground(blanco);
        this.setForeground(Color.white);
        
        this.datosG = new JPanel();
        this.datosG.setLayout(new GridLayout(3, 1));
        this.datosG.setSize(850, 90);
        this.datosG.setBorder(new EmptyBorder(10, 10, 10, 10));
        this.datosG.setBackground(blanco);       
        
        this.direccion = new JLabel();
        this.direccion.setText("Av. Tecnológico # 2595, Col. Lagos del Country. C.P. 63175");
        this.direccion.setFont(new Font("Monospaced",Font.PLAIN,14));
        this.direccion.setForeground(accent);
        this.direccion.setBackground(blanco);
        this.datosG.add(direccion);
        
        this.datos = new JLabel();
        this.datos.setText("Tepic, Nayarit. México. Tel: (311) 211 94 00. info@ittepic.edu.mx");
        this.datos.setFont(new Font("Monospaced",Font.PLAIN,12));
        this.datos.setForeground(accent);
        this.datos.setBackground(blanco);
        this.datosG.add(datos);
        
        this.pagina = new JLabel();
        this.pagina.setText("https://www.tecnm.mx/ | http://www.tepic.tecnm.mx/");
        this.pagina.setFont(new Font("Monospaced",Font.PLAIN,12));
        this.pagina.setForeground(accent);
        this.pagina.setBackground(blanco);
        this.datosG.add(pagina);
               
        this.add(logoSep);
        this.add(datosG);
        
    }
    
    
    
}
