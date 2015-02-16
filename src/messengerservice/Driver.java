/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messengerservice;

/**
 * This class is to demonstrate the MessageService. 
 * It requires that a MessageService object be created. When that message is 
 * created you can either send an message strategy to the constructor or else
 * assign a message strategy later using the setMessenger method.
 * 
 * @author Emma Kordik
 * @version 1.00
 */
public class Driver {
    
    public static void main(String[] args)
    {
       MessageService service = new MessageService(
               new RandomJoke(), new ConsoleWriter(), new ConsoleReader() ); 
       
        service.setMessage();

       service.getMessage();
           
       
    }
    
}
