/*
 *Daniel Alejandro Calderón Virgen 
 *No Lista 26
 *12:00 - 13:00 hrs 
 *18-02-2020
 */
package principal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Calderon
 */
public class MiPanel extends JPanel{
    
    private JLabel logoTecNM;
    private JLabel logoTecT;
    private JLabel titulo;

    public MiPanel() {
        this.setLayout(new GridLayout(1,4,5,5));
        logoTecNM = new JLabel(new ImageIcon(getClass().getResource("/img/logoTNM.png")));
        logoTecNM.setFont(new Font("Monospaced",Font.BOLD,14));
        titulo = new JLabel("Aquí añade titulo");
        titulo.setFont(new Font("Monospaced",Font.BOLD,18));
        
        this.setPreferredSize(new Dimension(700,100));
        this.setBackground(Color.BLUE);
        add(logoTecNM);
        add(titulo);
        
    }
    
}
