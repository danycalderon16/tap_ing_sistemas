/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Calderon
 */
public class PanelMapa extends JLabel{

    private String ruta;
    
    public PanelMapa() {
        setSize(400, 400);
        setIcon(new ImageIcon(this.getClass().getResource("/img/mexico.png")));
        
    }
    
    public void ponerMapa(String lugar){        
        setIcon(new ImageIcon(this.getClass().getResource("/img/"+lugar+".png")));
    }
}
