/**
 * Application Purpose: This Class' purpose is to create an enemy object the contains their health. It also
 * contains various methods that check if enemy is dead or what the enemy name is.
 * Author: Yama Kamal
 * Date: November 2021
 * Time: 2:00pm
 */
import java.util.Random; //importing the Random class
public class Enemy //start of class Enemy
{
    private int health;

    public Enemy() //default constructor
    {

    }
    //constructor that takes one argument enemy health
    public Enemy(int health)
    {
        this.health = health;
    }

    //setter and getter for enemy health
    public int getHealth()
    {
        return health;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }

    //this method is static so that it can be accessed without instantiation of the object
    //this method returns a random enemy from a String array
    public static String enemyName()
    {
        Random r1 = new Random();
        String[] monster = {"Goblin", "Skeleton", "Zombie", "Spider", "Vampire" , "Dragon", "Werewolf", "Ghoul", "Mummy", "Witch"};
        int number = r1.nextInt(10);
        return monster[number].toUpperCase();
    }
    //this method returns an integer based on a random number
    public int attackPower()
    {
        Random randomNumber = new Random();
        int power = randomNumber.nextInt(20);
        return power+1;
    }

    //this method checks if enemy health is 0 and returns a boolean value
    public boolean dead()
    {   if(health <= 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
} //end of the Enemy class
