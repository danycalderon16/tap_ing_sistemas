/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JFrame;

/**
 *
 * @author Calderon
 */
public class NewClass extends JFrame{
    
    public NewClass() {
        setSize(1000,300);        
    }    
    
    public static void main(String[] args) {
        //new NewClass().setVisible(true);
        boolean a = true;
        boolean b = false;
        System.out.println(a&&b);
        System.out.println(a||b);
    }
    
    
}
