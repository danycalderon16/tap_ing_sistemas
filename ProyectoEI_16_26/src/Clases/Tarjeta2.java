/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import static Clases.Utils.*;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Calderon
 */
public class Tarjeta2 extends JFrame {
    
    private JLabel label;
    private JLabel img;
    private JPanel panel;

    public Tarjeta2() throws HeadlessException {
        setSize(1050, 700);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setBackground(blanco);
        setTitle("Estrategias para clase");
        
        panel = new JPanel();
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        panel.setSize(1050,700);
        panel.setBackground(blanco);
        
        label = new JLabel(texto);
        label.setSize(1050,700);
        label.setFont(new Font("Monospaced",Font.CENTER_BASELINE,14));
        label.setBackground(negro);
        
        img = new JLabel();
        img.setIcon(new ImageIcon(this.getClass().getResource("/img/educacioni.jpg")));
        
        panel.add(label);
        //panel.add(img);
        this.add(panel);
    }
    
    
    private String texto ="<html>1. Conocer a tus alumnos<br>" 
                +"Este es el paso número uno para entender las necesidades de cada estudiante. Conocer a los estudiantes  es una forma de entender<br> "
                + "su mirada, su contexto, sus dificultades y sus fortalezas y por ende, es una estrategia clave para crear espacios que apuntan<br>"
                + "hacia la inclusión. Todos tus estudiantes son diferentes y entenderlo es fundamental para cumplir este objetivo.<br><br>" 
                +"2. Transmitir y creer<br>" 
                + "Entender las diferencias y aceptarlas como parte del enriquecimiento del aula es clave. Pero más importante aún es <br>"
                + "creer realmente en esto y saber transmitir los aspectos positivos de dichas diferencias para que los mismo estudiantes<br>"
                + "saquen provecho de esto y entiendan que no hay nada de malo en ello.<br><br>"
                +"3. Metodologías activas<br>"
                +"Estas metodologías promueven la participación de todos los estudiantes y fomentan el trabajo colaborativo y el <br>"
                + "pensamiento crítico, lo que convierte a los estudiantes en los protagonistas de su propio aprendizaje.<br><br>"
                +"4. Los actores principales<br>" +
                "De la mano con el punto anterior, para crear salas inclusivas es importante convertir a los estudiantes en los actores<br>"
                + " principales del aprendizaje. Una buena forma de hacerlo es permitiéndoles opinar con respecto al tipo de actividades<br>"
                + " que les gustaría realizar en clase.<br><br>"
                +"5. La comunicación<br>" +
                "No sólo es necesario conocer a todos los estudiantes, también es importante mantener una comunicación constante y efectiva<br>"
                + " con todos. Para eso, debes buscar espacios de diálogo que te permitan entender aún más sus necesidades, impresiones, <br>"
                 + "preocupaciones y opiniones. Ellos son los que más te pueden ayudar a la hora de medir las dinámicas del trabajo inclusivo.<br><br>"
                +"6. Metas alcanzables<br>" +
                "El aprendizaje debe ser un desafío, pero uno realizable. Pensando en las capacidades de cada uno de los estudiantes, se deben <br>"
                + "pensar en objetivos que todos ellos, sin excepción alguna, puedan efectivamente comprender y realizar.<br><br>"
                +"7. Las familias<br>" +
                "Conocer a los estudiantes también significa conocer a sus familias. Ellos son una pieza clave del aprendizaje y un<br>"
                + "recurso muy valioso al pensar en un aula inclusiva. No te olvides de forjar relaciones de confianza con ellos pues <br>"
                + "son una parte esencial en la vida de tus alumnos.</html>";
                }
