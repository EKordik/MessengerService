/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messengerservice;

/**
 * This class implements Messageable interface and returns a warning message.
 * When this class is called it returns a warning message.
 * 
 * @author ekordik
 * @version 1.00
 */
public class WarnMessage implements Messageable {
    private String message;
    
    public void setMessage(String message){
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }
    
}
