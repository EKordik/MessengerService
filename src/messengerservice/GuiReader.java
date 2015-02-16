/*
 * Emma Kordik
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messengerservice;

import javax.swing.JOptionPane;

/**
 * This class implements Reader and ask the user to enter text in a GUI window.
 * It returns a string message.
 * 
 * @author Emma Kordik
 * @version 1.00
 */
public class GuiReader implements Reader {

    
    @Override
    public String setMessage() {
        String message = JOptionPane.showInputDialog("Enter Your Text: ");
        return message;
    }
    
}
