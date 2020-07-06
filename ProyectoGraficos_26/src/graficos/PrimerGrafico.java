/*
 *Daniel Alejandro Calderón Virgen 
 *No Lista 26
 *12:00 - 13:00 hrs 
 *10-03-2020
 */
package graficos;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

public class PrimerGrafico {
    
    public static void main(String[] args) {
        MarcoFrame marco = new MarcoFrame();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class MarcoFrame extends JFrame{

    public MarcoFrame() throws HeadlessException {
        setTitle("Primer Grafico");
        setSize(500,500);
        Lamina lamina = new Lamina();
        add(lamina);
    }    
}//marcoFrame

class Lamina extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        
        File ruta = new File("C:\\Users\\dayae\\Documents\\NetBeansProjects\\ProyectoGraficos_26\\src\\graficos\\logo.png");
        
        try {
            BufferedImage img = ImageIO.read(ruta);
        
        super.paintComponent(g); 
        
        g.drawRect(50, 50, 400, 300);
        g.setFont(new Font("Tahoma",Font.PLAIN,40));
        g.setColor(Color.BLUE);
        g.drawString("Hola Mundo", 10, 60);
        
        g.drawImage(img, 10, 10, this);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,"No se a encontrado la imagen ...verificar");
        }
        
        
    } 
}