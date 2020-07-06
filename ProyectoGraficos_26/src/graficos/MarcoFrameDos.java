/*
 *Daniel Alejandro Calderón Virgen 
 *No Lista 26
 *12:00 - 13:00 hrs 
 *10-03-2020
 */
package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Calderon
 */
public class MarcoFrameDos extends JFrame {
   
    String nombre; 
    String noControl;
    String carrera;
    String domicilio;

    public MarcoFrameDos(String nombre, String noControl, String carrera, String domicilio) throws HeadlessException {
        this.nombre = nombre;
        this.noControl = noControl;
        this.carrera = carrera;
        this.domicilio = domicilio;
        
        setTitle("Credencial TecNM -Campues Tepic-");
        setSize(664,400);
        LaminaDos lamina = new LaminaDos(nombre, noControl, carrera, domicilio);
        add(lamina);
    }
}

class LaminaDos extends JPanel{
    String nombre; 
    String noControl;
    String carrera;
    String domicilio;

    public LaminaDos(String nombre, String noControl, String carrera, String domicilio) {
        this.nombre = nombre;
        this.noControl = noControl;
        this.carrera = carrera;
        this.domicilio = domicilio;
        setBackground(new Color(26,35,126));
        
    }
        @Override
        protected void paintComponent(Graphics g) {
        
        File rutaLogoITT = new File("C:\\Users\\dayae\\Documents\\NetBeansProjects\\ProyectoGraficos_26\\src\\graficos\\logo.png");
        File rutaLogoTNM = new File("C:\\Users\\dayae\\Documents\\NetBeansProjects\\ProyectoGraficos_26\\src\\graficos\\logoTNM.png");
        File rutaFoto = new File("C:\\Users\\dayae\\Documents\\NetBeansProjects\\ProyectoGraficos_26\\src\\graficos\\monalisa.jpg");
        
        try {
            BufferedImage imgITT = ImageIO.read(rutaLogoITT);   
            BufferedImage imgTNM = ImageIO.read(rutaLogoTNM);  
            BufferedImage imgFoto = ImageIO.read(rutaFoto);        
            super.paintComponent(g);     
            g.setFont(new Font("Tahoma", Font.PLAIN, 18));
            
            g.drawImage(imgITT, 10, 200, this);
            g.drawImage(imgTNM, 250, 30, this);
            g.drawImage(imgFoto, 40, 40, this);
            g.setColor(Color.white);
            g.drawString("ESTUDIANTE", 250, 20);
            g.drawString("Nombre "+nombre, 250, 230);
            g.drawString("No. Control "+noControl, 250, 260);
            g.drawString("Carrera "+carrera, 250, 290);
            g.drawString("Domicilio "+domicilio, 250, 320);
            } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,"No se a encontrado la imagen ...verificar");
        }       
    } 
}
