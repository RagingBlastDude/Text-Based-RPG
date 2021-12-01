/**
 * Application Purpose: This Class' purpose is to allow for the game to flow. Each method is a game state.
 * Author: Yama Kamal
 * Date: November 2021
 * Time: 2:00pm
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
public class Game //start of Game class
{
    //state of the object Game are variables that reference different class objects
    private Player p1 = new Player(100);
    private Scanner s1 = new Scanner(System.in);
    private Enemy e1 = new Enemy(200);
    private Weapon playerWeapon = new Weapon();

    public Game() //default constructor
    {

    }
    //this method will ask the user for a name and set the player object's name
    public void setup()
    {
        String[][] gameName = {{"Basic","Amazing","Cool"},{"RPG","Gaya","World"}};
        Random arrayIndex = new Random();
        System.out.println("Welcome to " + gameName[0][arrayIndex.nextInt(3)] + " " + gameName[1][arrayIndex.nextInt(3)]);
        System.out.print("Enter your name: ");
        p1.setName(s1.nextLine());
        System.out.println("Welcome " + p1.getName() + "!");
        mainRoad(); //calls the MainRoad method
    }
    //this method asks the user to make 1 of 3 choices
    private void mainRoad()
    {
        int choice = 0;
        //this loops until the user selects 1, 2, or 3
        while(choice!=1 && choice!=2 && choice!=3)
        {
            //contain try catch to verify user input
            try {
                System.out.println("------------------------------------------------------");
                System.out.println("You've arrived at the Main Road! What will you do next?");
                System.out.println("1. Talk to stranger at the gate.");
                System.out.println("2. Take the left path.");
                System.out.println("3. Take the right path.");
                choice = s1.nextInt();
                if (choice == 1)
                {
                    talk();
                }
                else if (choice == 2)
                {
                    left();
                }
                else if (choice == 3)
                {
                    right();
                }
                else
                {
                    System.out.println("Please enter a valid number!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid input!");
                s1.nextLine();
            }
        }
    }
    //this method asks the user to select 1 of 3 choices
    public void talk()
    {
        int choice = 0;
        //this loop will always run once
        do
        {
            try {
                System.out.println("------------------------------------------------------");
                System.out.println("Hi there my name is Jerry and I'm the mayor of this town.");
                System.out.println("1. Introduce yourself.");
                System.out.println("2. Ask what he's doing out.");
                System.out.println("3. Ask to enter the town.");
                choice = s1.nextInt();
                switch (choice)
                {
                    case 1:
                        System.out.println("Hello " + p1.getName() + " welcome to the town of Gaya!");
                        break;
                    case 2:
                        System.out.println("I was out patrolling the streets. I heard there's a monster in the cave nearby.");
                        break;
                    case 3:
                        System.out.println("Come on in!");
                        gaya();
                        break;
                    default:
                        System.out.println("Invalid Number!");
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please enter a valid input!");
                s1.nextLine();
            }
        //this loops until the user selects 3
        }while(choice!=3);
    }
    //this method asks the user to select 1 of 3 choices
    public void gaya()
    {
        int choice = 0;
        //this loops until the user selects 1, 2, or 3
        while(choice != 1 && choice != 2 && choice != 3)
        {
            //contain try catch to verify user input
            try {
                System.out.println("------------------------------------------------------");
                System.out.println("Jerry leads you thorough the gate.");
                System.out.println("JERRY: I'll take you to my armory to get some new gear.");
                System.out.println("Arrived at the Jerry's armory!");
                System.out.println("JERRY: Take your pick!");
                System.out.println("1. Take the sword");
                System.out.println("2. Take the bow");
                System.out.println("3. Take the axe");
                choice = s1.nextInt();
                //depending on user choice will change the state of the Weapon object
                switch (choice)
                {
                    case 1:
                        System.out.println(p1.getName() + " chooses the sword!");
                        playerWeapon.setWeaponName("Sword");
                        break;
                    case 2:
                        System.out.println(p1.getName() + " chooses the bow!");
                        playerWeapon.setWeaponName("Bow");
                        break;
                    case 3:
                        System.out.println(p1.getName() + " chooses the axe!");
                        playerWeapon.setWeaponName("Axe");
                        break;
                    default:
                        System.out.println("Invalid Number!");
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please enter a valid input!");
                s1.nextLine();
            }
        }
        System.out.println(p1.getName() + " thanks Jerry for the " + playerWeapon.getWeaponName() + " and heads back to the main road.");
        mainRoad();
    }
    //this method asks the user to make one of two choices
    public void left()
    {
        int choice = 0;
        //this loops until the user selects 1 or 2
        while(choice != 1 && choice != 2)
        {
            //contain try catch to verify user input
            try {
                System.out.println("------------------------------------------------------");
                System.out.println("You've arrived at a cave!");
                System.out.println("1. Enter cave");
                System.out.println("2. Go back to main road");
                choice = s1.nextInt();
                //depending on user chose will call different method
                switch (choice)
                {
                    case 1:
                        cave();
                        break;
                    case 2:
                        mainRoad();
                        break;
                    default:
                        System.out.println("Invalid input! Try again.");
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please enter a valid input!");
                s1.nextLine();
            }
        }
    }
    //this method asks the user to make one of two choices
    public void right()
    {
        int choice = 0;
        //this loops until the user selects 1 or 2
        while (choice != 1 && choice != 2)
        {
            //contain try catch to verify user input
            try {
                System.out.println("------------------------------------------------------");
                System.out.println("You've found an abandoned house!");
                System.out.println("1. Enter house");
                System.out.println("2. Go back to main road");
                choice = s1.nextInt();
                switch (choice)
                {
                    case 1:
                        house();
                        break;
                    case 2:
                        mainRoad();
                        break;
                    default:
                        System.out.println("Invalid input! Try again.");
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please enter a valid input!");
                s1.nextLine();
            }
        }
    }
    //this method asks the user to make one of two choices
    public void house()
    {
        int choice = 0;
        //this loops until the user selects 1 or 2
        while (choice != 1 && choice != 2)
        {
            //contain try catch to verify user input
            try {
                System.out.println("------------------------------------------------------");
                System.out.println("The house is very dusty. A small vile is found on a nearby table!");
                System.out.println("1. Pick up the vile.");
                System.out.println("2. Leave the house");
                choice = s1.nextInt();
                switch (choice)
                {
                    case 1:
                        Random randomNumber = new Random();
                        Potion.potionAmount = randomNumber.nextInt(10)+1;
                        System.out.println("You've found " + Potion.potionAmount + " potions! Hint: *Use in battle to restore 20hp*");
                        Potion.potionState = true;
                        System.out.println(p1.getName() + " finds nothing else of value and leaves the abandoned house");
                        right();
                        break;
                    case 2:
                        right();
                        break;
                    default:
                        System.out.println("Invalid input! Try again.");
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please enter a valid input!");
                s1.nextLine();
            }
        }
    }
    //this method asks the user to make one of two choices
    public void cave()
    {
        int choice = 0;
        //this loops until the user selects 1 or 2
        while(choice != 1 && choice !=2)
        {
            //contain try catch to verify user input
            try {
                System.out.println("------------------------------------------------------");
                System.out.println("The cave is barely lit. A faint sound is heard in the distance.");
                System.out.println("1. Follow sound.");
                System.out.println("2. Ask who's there.");
                choice = s1.nextInt();
                switch (choice) {
                    case 1:
                        battle();
                        break;
                    case 2:
                        System.out.printf("%s: Who's there?%nUnknown: Come find me%n", p1.getName());
                        choice = 0;
                        break;
                    default:
                        System.out.println("Invalid input! Try again.");
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please enter a valid input!");
                s1.nextLine();
            }
        }
    }
    //this method asks the user to select one of three choices
    public void battle()
    {
        String enemy = Enemy.enemyName();
        System.out.println("------------------------------------------------------");
        System.out.println("A mysterious " + enemy + " has appeared!");
        System.out.println(enemy + ": I will destroy you!");
        int choice = 0;
        //this loops until the user selects 3 or player is dead or enemy is dead
        while(!p1.dead() && !e1.dead() && choice != 3)
        {
            //contain try catch to verify user input
            try {
                System.out.println("------------------------------------------------------");
                System.out.println("What will " + p1.getName() + " do?");
                System.out.println("1. Attack " + enemy);
                System.out.println("2. Heal");
                System.out.println("3. Run");
                System.out.printf("%s Health: %d",p1.getName(),p1.getHealth());
                System.out.printf("%n%s Health: %d%n",enemy,e1.getHealth());
                choice = s1.nextInt();
                if (choice == 1)
                {
                    //this section will print a weapon specific message
                    //player and enemy trade damage. Prints enemy and player health remaining
                    int enemyDamage = e1.attackPower();
                    int playerDamage = p1.attackPower(playerWeapon.getWeaponName());
                    System.out.println("------------------------------------------------------");
                    String weaponChoice = playerWeapon.getWeaponName();
                    if(weaponChoice.equals("Bow"))
                    {
                        System.out.printf("%n%s pulls back on their bow and shoots the %s%n", p1.getName(), enemy);
                    }
                    else if(weaponChoice.equals("Sword"))
                    {
                        System.out.printf("%n%s draws their sword and slices down on the %s%n",p1.getName(),enemy);
                    }
                    else if(weaponChoice.equals("Axe"))
                    {
                        System.out.printf("%n%s slashes their axe at the %s%n",p1.getName(),enemy);
                    }
                    int enemyHealth = e1.getHealth();
                    enemyHealth -= playerDamage;
                    e1.setHealth(enemyHealth);
                    int playerHealth = p1.getHealth();
                    playerHealth -= enemyDamage;
                    p1.setHealth(playerHealth);
                    System.out.printf("%n%s did %d damage to %s",p1.getName(),playerDamage,enemy);
                    System.out.printf("%n%s did %d damage to %s%n",enemy,enemyDamage,p1.getName());
                }
                else if (choice == 2)
                {
                    p1.heal();
                }
                else if (choice == 3)
                {
                    System.out.println(p1.getName() + " got away successfully back to the cave entrance!");
                    e1.setHealth(200);
                }
                else
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please enter a valid input!");
                s1.nextLine();
            }
            catch (NullPointerException e)
            {
                System.out.println("Go back to the main road talk to the major to get a weapon!");
                s1.nextLine();
            }
        }
        if(choice == 3)
        {
            left();
        }
        else
        {
            gameOver(enemy);
        }
    }
    //this method will check if player is dead and display a message
    public void gameOver(String monster)
    {
        if(p1.dead())
        {
            System.out.println("------------------------------------------------------");
            System.out.println("******GAME OVER***********");
            System.out.println("You lose!");
            System.out.println("Sorry " + p1.getName() + ", you can rest now :(");
        }
        else
        {
            System.out.println("------------------------------------------------------");
            System.out.println("******GAME OVER***********");
            System.out.println("You win!");
            Random randomNumber = new Random();
            Integer gold = randomNumber.nextInt(100)+1;
            System.out.println("You've defeated the " + monster + "!");
            System.out.printf("Player gets %s gold!%n",gold.toString());
            System.out.println("Thanks for playing! :)");
        }
    }
} //end of Game class

