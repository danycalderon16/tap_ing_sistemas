/*
 *Daniel Alejandro Calderón Virgen 
 *No Lista 26
 *12:00 - 13:00 hrs 
 *31 - 03 - 2020
 */


package conectores;

import conexiones.LibreriaConexion;
import conexiones.LlavesForaneas;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

/**
 *
 * @author Calderon
 */
public class Utils {
    
    public static LibreriaConexion libreria = new LibreriaConexion("localhost", "5432", "postgres", "postgres", "123");
    
    
    public static void llenarcombosFK(JComboBox cmb,String id, String nombre, String tabla){
        libreria.conectarBaseDatos();    
        
        ArrayList<LlavesForaneas> fk = libreria.obtenerLlavesForaneas(id,nombre, tabla);
       
        for (LlavesForaneas llavesForaneas : fk) 
            cmb.addItem(llavesForaneas.getId()+" - "+llavesForaneas.getNombre());
    }
    
    public static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
        Image img = icon.getImage();  
        Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);  
        return new ImageIcon(resizedImage);
    }
    
}
