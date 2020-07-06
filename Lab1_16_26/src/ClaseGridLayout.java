
/*
 *Daniel Alejandro Calderon Virgen 
 *No Lista 26
 *12:00 - 13:00 hrs 
 *05-02-2020
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ClaseGridLayout extends JFrame implements ActionListener{
    //Atributos de Clase 
    Toolkit t;
    Dimension dimension; // Obtienen el ancho y alto de la pantalla
    GridLayout grid;
    FlowLayout flow;
    //Componentes de la Ventana
    JLabel titulo;

    JPanel panelTitulo;
    JPanel panelReticula;
    JPanel panelReticula2;
    JPanel panelReticula3;
    JPanel panelReticula4;
    JPanel panelReticula5;
    JPanel panelReticula6;
   
    
    JButton arregloBotones[];
    ClaseDatos datos;
    private String materias[];
    Font fuente;

    //constructor
    
    
    public ClaseGridLayout(int aprobada[]) throws HeadlessException {
        //Obtener dimensiones de la ventana
        t = Toolkit.getDefaultToolkit();
        dimension = t.getScreenSize();
        propiedadesVentana();
        
        //Geeneracion de reticula
        panelTitulo = new JPanel();
        panelTitulo.setLayout(new FlowLayout());
        panelTitulo.setBackground(Color.BLUE);
        add(panelTitulo);
        
        arregloBotones = new JButton[50];
        fuente = new Font("Monospaced", Font.BOLD, 36);
        titulo = new JLabel();
               
        titulo.setBackground(Color.white);
        titulo.setText("Retícula Ingenieria en Sistemas Computacionales");
        titulo.setFont(fuente);
        add(titulo);
        panelTitulo.add(titulo);
        //Panel inferior
        panelReticula = new JPanel();
        panelReticula.setLayout(new GridLayout(1,8,5,5));
        panelReticula.setBackground(Color.black);
        add(panelReticula);
 
        panelReticula2 = new JPanel();
        panelReticula2.setLayout(new GridLayout(1,8,5,5));
        panelReticula2.setBackground(Color.black);
        add(panelReticula2);
        
        panelReticula3 = new JPanel();
        panelReticula3.setLayout(new GridLayout(1,8,5,5));
        panelReticula3.setBackground(Color.black);
        add(panelReticula3);
        
        panelReticula4 = new JPanel();
        panelReticula4.setLayout(new GridLayout(1,8,5,5));
        panelReticula4.setBackground(Color.black);
        add(panelReticula4);
        
        panelReticula5 = new JPanel();
        panelReticula5.setLayout(new GridLayout(1,8,5,5));
        panelReticula5.setBackground(Color.black);
        add(panelReticula5);
        
        panelReticula6 = new JPanel();
        panelReticula6.setLayout(new GridLayout(1,8,5,5));
        panelReticula6.setBackground(Color.black);
        add(panelReticula6);
        
        //Generar los botones por Materia
        int i;
        for (i = 0; i < 8; i++) {
            arregloBotones[i] = new JButton(materias[i]);
            arregloBotones[i].addActionListener(this);
            arregloBotones[i].setOpaque(true);
            arregloBotones[i].setBackground(ClaseDatos.verde);
            if(aprobada[i] == 1){
                arregloBotones[i].setBackground(ClaseDatos.morado);
                arregloBotones[i].setForeground(Color.white);                
            }            
            panelReticula.add(arregloBotones[i]);
        }
        
        for(;i<16;i++){            
            arregloBotones[i] = new JButton(materias[i]);
            arregloBotones[i].addActionListener(this);
            arregloBotones[i].setOpaque(true);
            arregloBotones[i].setBackground(ClaseDatos.verde);
            if(aprobada[i] == 1){
                arregloBotones[i].setBackground(ClaseDatos.morado);
                arregloBotones[i].setForeground(Color.white);                
            }            
            panelReticula2.add(arregloBotones[i]);
        }
        
        for(;i<24;i++){            
            arregloBotones[i] = new JButton(materias[i]);
            arregloBotones[i].addActionListener(this);
            arregloBotones[i].setOpaque(true);
            arregloBotones[i].setBackground(ClaseDatos.verde);
            if(aprobada[i] == 1){
                arregloBotones[i].setBackground(ClaseDatos.morado);
                arregloBotones[i].setForeground(Color.white);                
            }            
            panelReticula3.add(arregloBotones[i]);
        }
        
         for(;i<32;i++){            
            arregloBotones[i] = new JButton(materias[i]);
            arregloBotones[i].addActionListener(this);
            arregloBotones[i].setOpaque(true);
            arregloBotones[i].setBackground(ClaseDatos.verde);
            if(aprobada[i] == 1){
                arregloBotones[i].setBackground(ClaseDatos.morado);
                arregloBotones[i].setForeground(Color.white);                
            }            
            panelReticula4.add(arregloBotones[i]);
        }
        for(;i<40;i++){            
            arregloBotones[i] = new JButton(materias[i]);
            arregloBotones[i].addActionListener(this);
            arregloBotones[i].setOpaque(true);
            arregloBotones[i].setBackground(ClaseDatos.verde);
            if(aprobada[i] == 1){
                arregloBotones[i].setBackground(ClaseDatos.morado);
                arregloBotones[i].setForeground(Color.white);                
            }            
            panelReticula5.add(arregloBotones[i]);
        }
        for(;i<48;i++){            
            arregloBotones[i] = new JButton(materias[i]);
            arregloBotones[i].addActionListener(this);
            arregloBotones[i].setOpaque(true);
            arregloBotones[i].setBackground(ClaseDatos.verde);
            if(aprobada[i] == 1){
                arregloBotones[i].setBackground(ClaseDatos.morado);
                arregloBotones[i].setForeground(Color.white);                
            }            
            panelReticula6.add(arregloBotones[i]);
        }
    }//fin Constructor

    public void propiedadesVentana() {
        grid = new GridLayout(8, 1);   
        datos = new ClaseDatos();
        materias = datos.materias;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(dimension.width, dimension.height);
        setLocationRelativeTo(null);
        setLayout(grid);
        setResizable(false);
        setTitle("Ingeniería en Sistemas Computacionales");
    }//PropiedadesVentana

    @Override
    public void actionPerformed(ActionEvent ae) {
        
            
    }
}
