/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reproduciraudio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.*;
import javazoom.jl.player.Player;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
    
import static javax.swing.JOptionPane.*;
/**
 *
 * @author Calderon
 */
public class ReproducirAudio {

    public static void main(String[] args) {
        
        try {
            FileInputStream fls;
            Player player;
            
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showDialog(fileChooser, "Seleccione un audio");
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();
                        
            fls = new FileInputStream(ruta);
            
            BufferedInputStream bis = new BufferedInputStream(fls);
            
            player = new Player(bis);
            
            player.play();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReproducirAudio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JavaLayerException ex) {
            Logger.getLogger(ReproducirAudio.class.getName()).log(Level.SEVERE, null, ex);
        }       

    }

}
