/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Calderon
 */
public class LbImagen extends JLabel{

    public LbImagen() {
        setSize(200, 200);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    
    public void ponerImagen(String lugar){        
        setIcon(new ImageIcon(this.getClass().getResource("/img/"+lugar+".jpg")));
    }
     
            
    
}
