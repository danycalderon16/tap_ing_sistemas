/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import javax.swing.JTextField;

/**
 *
 * @author Calderon
 */
public class MyTextField extends JTextField {

    public MyTextField() {
        
        setSize(200,20);
    }
    
    public String obtenerTexo(){
        return this.getText();
    }
   
}
