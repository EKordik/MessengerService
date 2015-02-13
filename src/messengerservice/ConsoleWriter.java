/*
 * Emma Kordik
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messengerservice;


/**
 * This class implements the Writer interface and displays a message
 in the console.
 * 
 * @author emmakordik
 * @version 1.00
 */
public class ConsoleWriter implements Writer {

    
    @Override
    public void displayMessage(String message){
        System.out.println(message);
    }
}
