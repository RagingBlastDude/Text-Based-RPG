/**
 * Application Purpose: This Class' purpose is to create a weapon object with that contains weapon name
 * Author: Yama Kamal
 * Date: November 2021
 * Time: 2:00pm
 */
public class Weapon //start of Weapon class
{
    //instance variable
    private String weaponName;

    public Weapon() //default constructor
    {

    }
    //constructor that takes 1 argument of type String
    public Weapon(String weaponName)
    {
        this.weaponName = weaponName;
    }
    //getter for instance variable
    public String getWeaponName()
    {
        return weaponName;
    }
    //setter for instance variable
    public void setWeaponName(String weaponName)
    {
        this.weaponName = weaponName;
    }
} //end of Weapon class
