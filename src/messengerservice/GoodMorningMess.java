/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messengerservice;

/**
 * Message strategy class to display a good morning message.
 * This class implements Messageable and has a method to set the message that 
 * accepts a String argument and a method that returns the message.
 * The constructor provides a default good morning message in case no message 
 * was entered.
 * 
 * @author Emma Kordik
 * @version 1.00
 */
public class GoodMorningMess implements Messageable{
    private String message;
    
    //Constructor provides a default message of good morning in case no other message is provide
    public GoodMorningMess(){
        message="Good Morning!"; 
    }
    
    //Setter
    @Override
    public String getMessage() {
        return message;
    }
    
    //Getter
    @Override
    public void setMessage(String message) {
        this.message=message;
    }
    
}
