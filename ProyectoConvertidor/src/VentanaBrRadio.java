
/*
 *Daniel Alejandro Calderón Virgen 
 *No Lista 26
 *12:00 - 13:00 hrs 
 *14-02-2020
 */

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class VentanaBrRadio extends JFrame implements ItemListener{
    
    //Atributos
    private GridLayout grid;
    private ButtonGroup convertidorGrupo;
    private JRadioButton divisa;
    private JRadioButton volumen;
    private JRadioButton longitud;
    private JRadioButton pesoMasa;
    private JRadioButton temperatura;
    private JRadioButton energia;
    
    private JLabel labelConvetidor;
    private JLabel labelSalida;
    private JTextField campoEntrada;
    private JTextField campoSalida;
    
    private int peso;    
    private int litros;    
    private int km;    
    private int masa;   
    private int celsius;    
    private int julio;
    

    public VentanaBrRadio() throws HeadlessException {
        
        labelConvetidor = new JLabel("Convertir a...");
        campoEntrada = new JTextField();
        labelSalida = new JLabel("Salida");
        campoSalida = new JTextField();
        
        divisa = new JRadioButton("Divisa");
        volumen = new JRadioButton("Volumen");
        longitud = new JRadioButton("Longiud");
        pesoMasa = new JRadioButton("Peso y masa");
        temperatura = new JRadioButton("Temperatura");
        energia = new JRadioButton("Energía");
        convertidorGrupo = new ButtonGroup();
        
        propiedadesVentana();   
        add(labelConvetidor);
        add(campoEntrada);
        add(labelSalida);
        add(campoSalida);
        convertidorGrupo.add(divisa);
        convertidorGrupo.add(volumen);
        convertidorGrupo.add(longitud);
        convertidorGrupo.add(pesoMasa);
        convertidorGrupo.add(temperatura);
        convertidorGrupo.add(energia);
        
        add(divisa);
        add(volumen);
        add(longitud);
        add(pesoMasa);
        add(temperatura);
        add(energia);
        //Agregar escuchadores
        divisa.addItemListener(this);
        volumen.addItemListener(this);
        longitud.addItemListener(this);
        pesoMasa.addItemListener(this);
        temperatura.addItemListener(this);
        energia.addItemListener(this);
        
    }
    
    
     public void propiedadesVentana() {
	        grid = new GridLayout(10, 1);     
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(500, 700);
	        setLocationRelativeTo(null);
	        setLayout(grid);
	        setResizable(false);
	        setTitle("Convertidor");
	    }//PropiedadesVentana
    
    
    
    @Override
    public void itemStateChanged(ItemEvent ie) {
        try{
            if(ie.getItemSelectable() == divisa){
                if(ie.getStateChange() ==ItemEvent.SELECTED){

                    //Convertir la cantidad de campo entrada a 
                    // dolares y asignarla a campoSalida
                    peso = Integer.parseInt(campoEntrada.getText());
                    campoEntrada.setText(campoEntrada.getText()+" pesos");
                    campoSalida.setText(peso*.055+" dolares");
                }
            }
            if(ie.getItemSelectable() == volumen){
                if(ie.getStateChange() ==ItemEvent.SELECTED){
                    //Convertir la cantidad de campo entrada a 
                    // galones y asignarla a campoSalida
                    litros = Integer.parseInt(campoEntrada.getText());
                    campoEntrada.setText(campoEntrada.getText()+" litros");
                    campoSalida.setText(litros*0.2641+" galones");   
                }
            }
            if(ie.getItemSelectable() == longitud){
                if(ie.getStateChange() ==ItemEvent.SELECTED){
                    //Convertir la cantidad de campo entrada a 
                    // millas y asignarla a campoSalida
                    km = Integer.parseInt(campoEntrada.getText());
                    campoEntrada.setText(campoEntrada.getText()+" km");
                    campoSalida.setText(km*0.6213711+" millas");
                }
            }
            if(ie.getItemSelectable() == pesoMasa){
                if(ie.getStateChange() ==ItemEvent.SELECTED){
                    //Convertir la cantidad de campo entrada a 
                    // libras y asignarla a campoSalida
                    masa = Integer.parseInt(campoEntrada.getText());
                    campoEntrada.setText(campoEntrada.getText()+" kg");
                    campoSalida.setText(masa*2.20+" libras");
                }
            }
            if(ie.getItemSelectable() == temperatura){
                if(ie.getStateChange() ==ItemEvent.SELECTED){
                    //Convertir la cantidad de campo entrada a 
                    // grados kelvin y asignarla a campoSalida
                    celsius = Integer.parseInt(campoEntrada.getText());
                    campoEntrada.setText(campoEntrada.getText()+" °C");
                    campoSalida.setText(celsius+273.15+" K");
                }
            }
            if(ie.getItemSelectable() == energia){
                if(ie.getStateChange() ==ItemEvent.SELECTED){
                    //Convertir la cantidad de campo entrada a 
                    // caloria gramos y asignarla a campoSalida
                    julio = Integer.parseInt(campoEntrada.getText());
                    campoEntrada.setText(campoEntrada.getText()+" jouls");
                    campoSalida.setText(julio*0.239006+" caloria gramo");
                }
            }
        }catch(NumberFormatException e){
            System.out.println(e.getMessage().toString()+"");
        }
        
    }
    
}
