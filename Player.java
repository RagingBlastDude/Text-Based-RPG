/**
 * Application Purpose: This Class' purpose is to create a player object with that contains health and name
 * Author: Yama Kamal
 * Date: November 2021
 * Time: 2:00pm
 */

import java.util.Random; //imports the Random class

public class Player //start of the Player class
{
    //state of the object
    private int health;
    private String name;

    //default constructor
    public Player()
    {

    }

    //constructor that takes one argument health
    public Player(int health)
    {
        this.health = health;
    }

    //constructor that takes 2 arguments health and name
    public Player(int health, String name)
    {
        this.health = health;
        this.name = name;
    }
    //the following four methods are setters and getters for player name and health
    public void setHealth(int health)
    {
        this.health = health;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getHealth()
    {
        return health;
    }

    public String getName()
    {
        return name;
    }

    //this method returns a boolean checks if player is dead
    public boolean dead()
    { // if player health is less than or equal 0 returns true else returns false
        if(health <= 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //this method checks player health and the class variables from the Potion class and heals the player
    public void heal()
    {
        if(Potion.potionState == true && health < 100 && Potion.potionAmount > 0)
        {
            int potionHealth = 20;
            Potion potionTwenty = new Potion(potionHealth);
            health += potionTwenty.getHealthRestored();
            if (health > 100)
            {
                health = 100;
            }
            Potion.potionAmount--;
            System.out.printf("Health Restored by %d hp!%n",potionHealth);
        }
        else if(Potion.potionState != true)
        {
            System.out.println("Don't have the potion! *Hint: Get potion from abandoned house.*");
        }
        else if(Potion.potionAmount <= 0)
        {
            System.out.println("No more potions remaining!");
        }
        else if(health == 100)
        {
            System.out.println("Health already full at " + health);
        }
        System.out.println(Potion.potionAmount + " potions remaining");
    }
    //this method returns an integer based on a random number
    public int attackPower()
    {
        Random randomNumber = new Random();
        int number = randomNumber.nextInt(20);
        return number+1;
    }
    //this method returns an integer based on the String passed in
    public int attackPower(String weapon)
    {
        int power = 0;
        if(weapon.toLowerCase().equals("bow"))
        {
            power = 15;
        }
        else if(weapon.toLowerCase().equals("axe"))
        {
            power = 30;
        }
        else if(weapon.toLowerCase().equals("sword"))
        {
            power = 20;
        }
        return power;
    }
} //end of the Player class
