/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author Calderon
 */
public class Etiqueta extends JLabel{

    public Etiqueta() {
        setText("Ingrese texto");
        setForeground(Color.black);
        setFont(new Font("Monospaced",Font.BOLD,18) );
        
    }
    
    public void ponerText(String text){
        setText(text);
    }
    
}
