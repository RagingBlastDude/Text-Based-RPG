/**
 * Application Purpose: This Class' purpose is to create a blueprint for the Potion object
 * Author: Yama Kamal
 * Date: November 2021
 * Time: 2:00pm
 */
public class Potion //start of Potion class
{
    //one instance variable. Two class/static variables
    private int healthRestored;
    static int potionAmount;
    static boolean potionState = false;

    public Potion() //default constructor
    {

    }
    //constructor that takes one argument
    public Potion(int healthRestored)
    {
        this.healthRestored = healthRestored;
    }

    //setter and getter method for healthRestored
    public int getHealthRestored()
    {
        return healthRestored;
    }

    public void setHealthRestored(int healthRestored)
    {
        this.healthRestored = healthRestored;
    }
} //end of Potion class
