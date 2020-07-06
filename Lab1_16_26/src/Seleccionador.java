
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

import static javax.swing.JOptionPane.*;


/*
 *Daniel Alejandro Calderon Virgen 
 *No Lista 26
 *12:00 - 13:00 hrs 
 *10-02-2020
 */
public class Seleccionador extends JFrame implements ActionListener {

    private GridLayout grid = new GridLayout();
    private JCheckBox []arregloCheck;
    
    private ClaseDatos datos;
    private JButton calcula;
    private int totalMateria;
    private int aprobada[] = new int[50];

    public Seleccionador() {
        arregloCheck = new JCheckBox[50];
        datos = new ClaseDatos();
        datos.t = Toolkit.getDefaultToolkit();
        datos.dimension = datos.t.getScreenSize();
        calcula = new JButton("Calcula");
        calcula.addActionListener(this);
        propiedadesVentana();
        int i = 0;
        for(;i<8;i++){
            arregloCheck[i] = new JCheckBox(datos.materias[i]);
            if(arregloCheck[i].isSelected())aprobada[i]=1;
            add(arregloCheck[i]);
        }
        for(;i<16;i++){
            arregloCheck[i] = new JCheckBox(datos.materias[i]);
            if(arregloCheck[i].isSelected())aprobada[i]=1;
            add(arregloCheck[i]);
        }
        for(;i<24;i++){
            arregloCheck[i] = new JCheckBox(datos.materias[i]);
            if(arregloCheck[i].isSelected())aprobada[i]=1;
            add(arregloCheck[i]);
        }
        for(;i<32;i++){
            arregloCheck[i] = new JCheckBox(datos.materias[i]);
            if(arregloCheck[i].isSelected())aprobada[i]=1;
            add(arregloCheck[i]);
        }
        for(;i<40;i++){
            arregloCheck[i] = new JCheckBox(datos.materias[i]);
            if(arregloCheck[i].isSelected())aprobada[i]=1;
            add(arregloCheck[i]);
        }
        for(;i<48;i++){
            arregloCheck[i] = new JCheckBox(datos.materias[i]);
            if(arregloCheck[i].isSelected())aprobada[i]=1;
            add(arregloCheck[i]);
        }
        
        add(calcula);
    }
    
    
    
    
    public void propiedadesVentana() {
        grid = new GridLayout(6, 7);     
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(datos.dimension.width, datos.dimension.height);
        setLocationRelativeTo(null);
        setLayout(grid);
        setResizable(false);
        setTitle("Datos Avance Retícula");
    }//PropiedadesVentana

   
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        for (int i = 0; i < 45; i++) {            
            if(arregloCheck[i].isSelected())aprobada[i]=1;
        }
        ClaseGridLayout grid = new ClaseGridLayout(aprobada);
        grid.setVisible(true);
                
    }
//100  -- 45
//    
    private float sacarPorcentaje(int totalMateria) {
        return (totalMateria*100/45);
    }
    
}
