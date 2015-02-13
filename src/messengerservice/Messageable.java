/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messengerservice;

/**
 * This interface is a template for message strategy classes.
 * Each low level message strategy class must have a get message method which 
 * returns a string literal.
 * 
 * @author ekordik
 * @version 1.00
 */
public interface Messageable {

    public void setMessage(String message);
    public String getMessage();
    
}
