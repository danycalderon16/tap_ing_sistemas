/*Edgar Rojas Medina
 *Daniel Alejandro Calderón Virgen 
 *No Lista 16 y 26 
 *12:00 - 13:00 hrs 
 *28-02-2020
 */
package Clases;

import static Clases.Utils.*;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Calderon
 */
public class PanelPrincipal extends JPanel{
    
    private JPanel tarjeta1;
    private JPanel tarjeta2;
    private JPanel tarjeta3;
    private JPanel tarjeta4;

    public PanelPrincipal() {
        this.setPreferredSize(new Dimension(1000, 380));
        this.setLayout(new GridLayout(1, 4,5,5));
        this.setBorder(new EmptyBorder(10, 10, 10, 10));
        
        tarjeta1 = new JPanel();
        tarjeta1.setSize(240,360);
        tarjeta1.setBackground(blanco);
        tarjeta1.setLayout(new GridBagLayout());
        tarjeta1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        tarjeta1.add(llenarTarjeta("<html>¿Qué es la <br>educación <br>inclusiva?</html>", 30));
        tarjeta1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                 new Tarjeta1().setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent me) {}

            @Override
            public void mouseReleased(MouseEvent me) {}
            @Override
            public void mouseEntered(MouseEvent me) {
                tarjeta1.setBackground(blancoLight);
            
            }
                            
            @Override
            public void mouseExited(MouseEvent me) {
                    tarjeta1.setBackground(blanco);
            }
        });
       
        tarjeta2 = new JPanel();
        tarjeta2.setSize(240,360);       
        tarjeta2.setBackground(blanco);
        tarjeta2.setLayout(new GridBagLayout());
        tarjeta2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        tarjeta2.add(llenarTarjeta("<html> <div style='text-align: center;'>Estrategias para implementar en clase</html>",30));
        tarjeta2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                 new Tarjeta2().setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent me) {}

            @Override
            public void mouseReleased(MouseEvent me) {}
            @Override
            public void mouseEntered(MouseEvent me) {
                tarjeta2.setBackground(blancoLight);
            
            }
                            
            @Override
            public void mouseExited(MouseEvent me) {
                tarjeta2.setBackground(blanco);
            }
        });
        
        tarjeta3 = new JPanel();
        tarjeta3.setSize(240,360);       
        tarjeta3.setBackground(blanco);
        tarjeta3.setLayout(new GridBagLayout());
        tarjeta3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        tarjeta3.add(llenarTarjeta("<html><div style='text-align: center;'> ¿Cómo <br>implementar en <br>clase?</html>",30));
        tarjeta3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                 new Tarjeta3().setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent me) {}

            @Override
            public void mouseReleased(MouseEvent me) {}
            @Override
            public void mouseEntered(MouseEvent me) {
                tarjeta3.setBackground(blancoLight);
            
            }
                            
            @Override
            public void mouseExited(MouseEvent me) {
                tarjeta3.setBackground(blanco);
            }
        });
        
        tarjeta4 = new JPanel();
        tarjeta4.setSize(240,360);       
        tarjeta4.setBackground(blanco);
        tarjeta4.setLayout(new GridBagLayout());
        tarjeta4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        tarjeta4.add(llenarTarjeta("<html><div style='text-align: center;'>¿Cómo <br>implementar en <br>clase?</html>",30));
        tarjeta4.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                 new Tarjeta4().setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent me) {}

            @Override
            public void mouseReleased(MouseEvent me) {}
            @Override
            public void mouseEntered(MouseEvent me) {
                    tarjeta4.setBackground(blancoLight);
            
            }
                            
            @Override
            public void mouseExited(MouseEvent me) {
                    tarjeta4.setBackground(blanco);
            }
        });
        
        this.add(tarjeta1);
        this.add(tarjeta2);
        this.add(tarjeta3);
        this.add(tarjeta4);
        
        
    }
    
    private JLabel llenarTarjeta(String texto,int n){
        JLabel label = new JLabel();
        label.setSize(200,300);
        label.setText(texto);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Miramonte",Font.BOLD,n)); 
        label.setBorder(new EmptyBorder(10, 10, 10, 10));
        label.setForeground(negro);
        label.setBackground(primary);
        return label;
    }
}
