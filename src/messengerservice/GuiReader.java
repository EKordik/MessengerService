/*
 * Emma Kordik
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messengerservice;

import javax.swing.JOptionPane;

/**
 *
 * @author emmakordik
 */
public class GuiReader implements Reader {

    
    @Override
    public String setMessage() {
        String message = JOptionPane.showInputDialog("Enter Your Message: ");
        return message;
    }
    
}
