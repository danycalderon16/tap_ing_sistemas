
/*
 *Daniel Alejandro Calderón Virgen 
 *No Lista 26
 *12:00 - 13:00 hrs 
 *13-02-2020
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Prediccion extends JFrame implements ItemListener {

    public static Color teal = new Color(0,121,107);
    public static Color indigo = new Color(83,109,254);
    public static Color gris = new Color(189,189,189);
    
    private int contador = 0;
    private GridLayout grid;
    private JCheckBox sintomas[];
    private JLabel descripcion;
    private JLabel labelTitulo;
    private JPanel panelTitulo;
    private String stringSintomas[] = {"Aumento de la sed y ganas de orinar",
        "Aumento del apetito",
        "Fatiga",
        "Visión borrosa",
        "Entumecimiento u hormigeo en las mano o pies",
        "Úlceras que no cicaatrizan",
        "Pérdida de peso sin razón aparente"};
        
    private Font fuente;

    public Prediccion() throws HeadlessException {
        
        sintomas = new JCheckBox[7];
        panelTitulo = new JPanel();
    	panelTitulo.setBackground(indigo);
    	labelTitulo = new JLabel("Predicción de diabetes");
    	fuente = new Font("Monospaced",Font.BOLD,22);
    	labelTitulo.setFont(fuente);
    	panelTitulo.add(labelTitulo);
        
        add(panelTitulo);
        
        for(int i = 0;i<7;i++){
            sintomas[i] = new JCheckBox(stringSintomas[i]);
            sintomas[i].setFont(fuente);
            sintomas[i].addItemListener(this);
            add(sintomas[i]);
        }
    	
    	descripcion = new JLabel("La probabilidad de tener diabetes es de:  ");
    	descripcion.setFont( new Font("Monospaced",Font.ITALIC,18));
        add(descripcion);
        
        propiedadesVentana();
        
    }
    
    
    
     public void propiedadesVentana() {
	        grid = new GridLayout(9, 1);     
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(550, 700);
	        setLocationRelativeTo(null);
	        setLayout(grid);
	        setResizable(false);
	        setTitle("Predicción de diabetes");
	    }//PropiedadesVentana
    @Override
    public void itemStateChanged(ItemEvent ie) {
        for (int i = 0; i < 7; i++) {
            if(ie.getItemSelectable() == sintomas[i]){
                if(ie.getStateChange() == ItemEvent.SELECTED)
                    contador++;
                else
                    contador--;
            }
                
        }
        descripcion.setText("La probabilidad de tener diabetes es de:  "+probabilidad(contador)+"%");
    
    }

    private int probabilidad(int contador) {
       return (100*contador)/7;
    }
    
}
