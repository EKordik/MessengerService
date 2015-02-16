/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messengerservice;

/**
 * This class implements Messageable interface and returns a warning message.
 * It has a setMessage method which accepts a string argument and sets the 
 * message variable to that. The getMessage returns the message stored in the 
 * variable.
 * The constructor sets a default message to warn that no message was set in 
 * case someone wants to get a warning without setting a warning.
 * 
 * @author Emma Kordik
 * @version 1.00
 */
public class WarnMessage implements Messageable {
    private String message;
    
    //Constructor
    public WarnMessage(){
        message = "Warning: You entered no message!";
    }
    
    //Message setter
    public void setMessage(String message){
        this.message = message;
    }
    
    //Message getter
    @Override
    public String getMessage() {
        return message;
    }
    
}
