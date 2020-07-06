/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import static Clases.Utils.*;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Calderon
 */
public class Tarjeta1 extends JFrame{

    private JLabel label;
    private JLabel img;
    private JPanel panel;
    
    public Tarjeta1() throws HeadlessException {
        setSize(950, 450);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setBackground(blanco);
        setTitle("¿Qué es la educación inclusiva?");
        
        panel = new JPanel();
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        panel.setSize(950,450);
        panel.setBackground(blanco);
        
        label = new JLabel(texto);
        label.setSize(950,450);
        label.setFont(new Font("Monospaced",Font.CENTER_BASELINE,16));
        label.setBackground(negro);
        
        img = new JLabel();
        img.setIcon(new ImageIcon(this.getClass().getResource("/img/educacioni.jpg")));
        
        panel.add(label);
        panel.add(img);
        this.add(panel);
        
    }
    
    private String texto = "<html>La UNESCO define la educación inclusiva en su documento conceptual  así: <br>¨"
                            + "La inclusión se ve como el proceso de identificar y responder a la diversidad de las<br>"
                            + "necesidades de todos los estudiantes a través de la mayor participación en el aprendizaje, <br>"
                            + "las culturas y las comunidades, y reduciendo la exclusión en la educación. Involucra <br>"
                            + "cambios y modificaciones en contenidos, aproximaciones, estructuras y estrategias, con <br>"
                            + "una visión común que incluye a todos los niño/as del rango de edad apropiado y la<br> "
                            + "convicción de que es la responsabilidad del sistema regular, educar a todos los niño/as¨ <br>" 
                            +"<br>Se basa en el principio de que cada niño/a tiene características, intereses, <br>"
                            + "capacidades y necesidades de aprendizaje distintos y deben ser los sistemas educativos <br>"
                            + "los que están diseñados, y los programas educativos puestos en marcha, teniendo en cuenta<br> "
                            + "la amplia diversidad de dichas características y necesidades.</html>";
    
  
}
