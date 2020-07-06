
package principal;

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
    
    
    private JLabel logoTecNM;
    private JLabel logoTecT;
    private JLabel derechos;
    private JLabel titulo;

   public PanelEncabezado() {    
        this.setLayout(new GridBagLayout());
        this.setPreferredSize(new Dimension(1000, 90));
        this.logoTecNM = new JLabel();
        this.logoTecNM.setText("");
        this.logoTecNM.setIcon(new ImageIcon(this.getClass().getResource("/img/logoTNM.png")));
        add(logoTecNM);
        
        this.titulo = new JLabel();
        this.titulo.setText("Añade Título aquí");
        this.titulo.setFont(new Font("Monospaced",Font.BOLD,20));
        this.titulo.setBorder(new EmptyBorder(10, 10, 10, 10));
        this.titulo.setForeground(Color.WHITE);
        this.add(titulo);
        
        this.logoTecT = new JLabel();
        this.logoTecT.setText("");
        this.logoTecT.setIcon(new ImageIcon(this.getClass().getResource("/img/logo.png")));
        add(logoTecT);
        
        this.derechos = new JLabel();
        this.derechos.setText("Derechos Reservados");
        this.derechos.setBorder(new EmptyBorder(10, 10, 10, 10));
        this.derechos.setFont(new Font("Monospaced",Font.BOLD,16));
        this.add(derechos);
        
        this.setBackground(Color.BLUE);
    }
   
   public void enviarTitulo(String texto){
       titulo.setText(texto);
   } 
    
   public void enviarLogo(String ruta){
        this.logoTecNM.setIcon(new ImageIcon(this.getClass().getResource(ruta)));
       
   }
}
