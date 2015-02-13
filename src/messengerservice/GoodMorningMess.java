/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messengerservice;

/**
 *
 * @author ekordik
 */
public class GoodMorningMess implements Messageable{

    @Override
    public String getMessage() {
        return "Good Morning";
    }

    @Override
    public void setMessage(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
