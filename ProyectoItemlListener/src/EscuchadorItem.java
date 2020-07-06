
/*
 *Daniel Alejandro Calderón Virgen 
 *No Lista 26
 *12:00 - 13:00 hrs 
 *12-02-2020
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import static javax.swing.JOptionPane.*;

public class EscuchadorItem extends JFrame implements ItemListener{

    public static Color teal = new Color(0,121,107);
    public static Color indigo = new Color(83,109,254);
    public static Color gris = new Color(189,189,189);
    public static Color blanco = new Color(255,255,255);
    public static Color accent = new Color(216,27,96);
    
    public static Color azul_bajo = new Color(224,242,241);
    
    private GridLayout grid;
    private JCheckBox musica;
    private JCheckBox pintura;
    private JCheckBox dibujar;
    private JCheckBox programar;
    private JLabel descripcion;
    private JLabel labelTitulo;
    private JPanel panelTitulo;
    private JLabel icono;

    private String sMusica;
    private String sPintura;
    private String sProgramar;
    private String sDibujar;
    
    private Font fuente;
    
    public EscuchadorItem() throws HeadlessException{
    	
    	icono = new JLabel(new ImageIcon("C:\\Users\\dayae\\Pictures\\monalisa.jpg"));
    	sMusica  ="";
    	sPintura ="";
    	sProgramar ="";
    	sDibujar ="";
    	panelTitulo = new JPanel();
    	panelTitulo.setBackground(indigo);
    	labelTitulo = new JLabel("Preferencias app <Persona Favorita>");
    	fuente = new Font("Monospaced",Font.BOLD,22);
    	labelTitulo.setFont(fuente);
    	panelTitulo.add(labelTitulo);
    	
    	musica = new JCheckBox("Música");
    	musica.setFont(fuente);
    	pintura = new JCheckBox("Pintura");
    	pintura.setFont(fuente);
    	
    	programar = new JCheckBox("Programar");
    	programar.setFont(fuente);
    	dibujar = new JCheckBox("Dibujar");
    	dibujar.setFont(fuente);
    	
    	descripcion = new JLabel("Ha seleccionado: ");
    	descripcion.setFont( new Font("Monospaced",Font.ITALIC,18));

    	musica.addItemListener(this);
    	pintura.addItemListener(this);
    	dibujar.addItemListener(this);
    	programar.addItemListener(this);
    	
    	add(panelTitulo);
    	add(icono);
    	add(musica);
    	add(pintura);
    	add(dibujar);
    	add(programar);
    	add(descripcion);
    	propiedadesVentana();
    	
	}
	
	@Override
	public void itemStateChanged(ItemEvent event) {
		if(event.getItemSelectable()==musica) {
			if(event.getStateChange() == ItemEvent.SELECTED)
				sMusica = " -Música";
			else
				sMusica="";
			
		}
		
		if(event.getItemSelectable()==pintura) { 
			if(event.getStateChange() == ItemEvent.SELECTED)
				sPintura = " -Pintura";
			else
				sPintura="";			
		}
		
		if(event.getItemSelectable()==programar) {
			if(event.getStateChange() == ItemEvent.SELECTED)
				sProgramar = " -Programar";
			else
				sProgramar="";
			
		}
		if(event.getItemSelectable()==dibujar) { 
			if(event.getStateChange() == ItemEvent.SELECTED)
				sDibujar = " -Dibujar";
			else
				sDibujar="";			
		}
		
		descripcion.setText("Ha seleccionado:"+sMusica+sPintura+"\n"+sDibujar+sProgramar);
	}
	
	 public void propiedadesVentana() {
	        grid = new GridLayout(7, 1);     
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(500, 700);
	        setLocationRelativeTo(null);
	        setLayout(grid);
	        setResizable(false);
	        setTitle("Preferencias Persona Favorita");
	    }//PropiedadesVentana

}
