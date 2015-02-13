/*
 * Emma Kordik
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messengerservice;
import java.util.Scanner;
/**
 *
 * @author emmakordik
 */
public class ConsoleReader implements Reader {
    private Scanner keyboard = new Scanner(System.in);
    private String message;
    
    @Override
    public String setMessage(){
        System.out.print("Enter Your Message: ");
        message = keyboard.nextLine();
        
        return message;
    }
    
}
