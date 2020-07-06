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
import javax.swing.JTextField;

/**
 *
 * @author Calderon
 */
public class MiTextField extends JTextField{

    public MiTextField() {
        this.setForeground(Color.BLUE);
        this.setPreferredSize(new Dimension(200,40));
        this.setFont(new Font("Monospaced",Font.ITALIC,12));
        this.setText("Copyright-TAP");
        
    }
    
    
    
}
