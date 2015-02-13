/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messengerservice;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * RandomJoke is a low-level class that implements the Messageable interface.
 * This class has a string array of jokes. WHen the getMessage is called it 
 * returns a random joke from the array using an Random number to generate a 
 * random number that acts as the index for the joke.
 * 
 * @author ekordik
 * @version 1.00
 */
public class RandomJoke implements Messageable {
    private String[] joke = new String[30];
    private int jokeIndex; //Variable to store the index of Jokes for entering new jokes
    private Random  randomNumbers = new Random();
    private int index;
    
    public RandomJoke(){
        joke[0] = "If at first you don't succeed don't try skydiving.";
        joke[1] = "I use to be addicted to the Hockey Pockey but I turned myself around";
        jokeIndex = 2;
    }
    
    //gets a random joke
    @Override
    public String getMessage(){
        index = randomNumbers.nextInt(jokeIndex);
        return joke[index];
    }

    //sets jokes
    @Override
    public void setMessage(String message) {
        if(jokeIndex < 30 ){
            joke[jokeIndex] = message;
            jokeIndex++;
        }
        else {
            JOptionPane.showMessageDialog(null, 
                    "You have too many jokes. No more can be stored.");
        }
    }
}
