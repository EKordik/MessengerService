/*
 * Emma Kordik
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messengerservice;

import javax.swing.JOptionPane;

/**
 * This class implements the Writer interface and displays a message in a GUI
 * Pane.
 * 
 * @author emmakordik
 * @version 1.00
 */
public class GuiWriter implements Writer{

    @Override
    public void displayMessage(String message) {
            JOptionPane.showMessageDialog(null, message);
    }
    
}
