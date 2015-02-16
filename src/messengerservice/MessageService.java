/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messengerservice;

/**
 * This message Service class is a high level class that interacts with an 
 * abstraction of a Messageable interface.
 * The purpose of this class is to return a message when it is asked for. It has
 * two constructors. One that accepts a message strategy and assigns it to the
 * variable messenger which is of data type Messageable. The other is a default
 * constructor that does not accept any arguments. This class also has a 
 * setMessage method which accepts a message strategy as an argument and assigns
 * it to the messenger variable. There is also a getMessage method that returns
 * a message to the user.
 * 
 * @author Emma Kordik
 * @version 1.00
 */
public class MessageService {
    
    private Messageable messenger; //Variable to hold a message strategy
    private Writer writer; //Variable to hold a writer 
    private Reader reader; //Variable to hold a message reader
    
    //Constructors 
    public MessageService(){
        
    }
    
    public MessageService(Messageable msg, Writer writer, Reader reader) {
        this.setMessenger(msg);
        this.setWriter(writer);
        this.setReader(reader);
        
    }

    //Setters
    public void setMessenger(Messageable msg) {
        this.messenger = msg;
    }
    
    public void setWriter(Writer writer){
        this.writer=writer;
    }
    
    public void setReader(Reader reader){
        this.reader = reader;
    }
    
    public void setMessage(){
        messenger.setMessage(reader.setMessage());
    }

    //Gets the message
    public void getMessage(){
        writer.displayMessage(messenger.getMessage());
    }
}
