/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Calderon
 */
public class PanelEncabezado extends JPanel {
    
    
    private JLabel logoNay;
    private JLabel logoTecT;
    private JLabel derechos;
    private JLabel titulo;

   public PanelEncabezado() {    
        this.setLayout(new GridBagLayout());
        this.setPreferredSize(new Dimension(600, 90));
        this.logoNay = new JLabel();
        this.logoNay.setText("");
        this.logoNay.setIcon(new ImageIcon(this.getClass().getResource("/img/logoGobNay.jpg")));
        add(logoNay);
        
        this.titulo = new JLabel();
        this.titulo.setText("Titulo");
        this.titulo.setFont(new Font("Monospaced",Font.BOLD,20));
        this.titulo.setBorder(new EmptyBorder(10, 10, 10, 10));
        this.titulo.setForeground(Color.WHITE);
        this.add(titulo);
        
        
        this.setBackground(new Color(0, 121, 107));
    }
   
   public void enviarTitulo(String texto){
       titulo.setText(texto);
   } 
    
   public void enviarLogo(String ruta){
        this.logoNay.setIcon(new ImageIcon(this.getClass().getResource(ruta)));
       
   }
}
