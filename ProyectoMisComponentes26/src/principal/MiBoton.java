
/*
 *Daniel Alejandro Calderón Virgen 
 *No Lista 26
 *12:00 - 13:00 hrs 
 *18-02-2020
 */
package principal;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;

public class MiBoton extends JButton {

    public MiBoton() {
        this.setBorder(null);
        this.setContentAreaFilled(false);
        this.setOpaque(true);
        this.setFont(new Font("Monospaced",Font.BOLD,14));
        this.setPreferredSize(new Dimension(200,80));
        this.setText("Copyrigth-TAP");
        this.setBackground(Color.BLUE);
        this.setForeground(Color.WHITE);
        this.setCursor(new Cursor(12));
                
        
    }

    

    
}
