/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

/**
 *
 * @author Calderon
 */
public class Botones extends JButton{

    public Botones() {
        setBackground(Color.WHITE);
        setOpaque(false);        
        setForeground(Color.black);      
        setSize(100,20);
        setFont(new Font("Monospaced",Font.BOLD,15) );
    }  
   
}
