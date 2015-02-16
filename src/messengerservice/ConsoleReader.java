/*
 * Emma Kordik
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messengerservice;
import java.util.Scanner;
/**
 * ConsoleReader implements Reader and reads input from the console.
 * This class is a class designed to read input from a console. 
 * It has a setMessage method that takes text the user enters through 
 * the console and returns it as a String to be sent to a message strategy.
 * 
 * @author Emma Kordik
 * @version 1.00
 */
public class ConsoleReader implements Reader {
    private Scanner keyboard = new Scanner(System.in);
    private String message;
    
    @Override
    public String setMessage(){
        System.out.print("Enter Your Text: ");
        message = keyboard.nextLine();
        
        return message;
    }
    
}
