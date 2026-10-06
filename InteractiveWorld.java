// 10.01.26
// Nevaeh Fernandez
// mevferna@uat.edu

// Thois makes it to where the program can read what the user types
import java.util.Scanner;

//My main class is matching the name of my file
public class InteractiveWorld{

    // Setting my code up just like we did in the day 1 example
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // This is how I serperate my title and make it stand out
        System.out.println("===========================");
        // I got inspired by character selection on Naruto so I though I'd make it related to something I really enjoy 
        System.out.println("   Miraculous: Which Miraculous hero are you?");
        System.out.println("===========================");

        // My introduction sentence to tell the user the purpose of my code
        System.out.println("Hawk Moth is on the loose! Answer a few questions and I'll find your Miraculous.");
        // I want my output to be well spaced out and not so crowded
        System.out.println();

        // Need the users name to begin
        System.out.println("Enter your name to begin: ");
        //This is what stores the user input
        String name = input.nextLine();

        // Users age inputF
        System.out.println("How old are you? ");
        // This is what will store the age input the user gives
        int age = input.nextInt();

        // Now I need to know hopw active the user is inorder to best match their Miraculous to their experiance
        System.out.println("How many times have you faught Akumas?");
        double amount = input.nextDouble();

        // These are the options the user has of which is their desired power
        System.out.println("Which power do you want?");
        System.out.println(" 1 - Creation (Ladybug)");
        System.out.println(" 2 - Destruction (Cat Noir)");
        System.out.println(" 3 - Illusion (Rena Rouge)");
        System.out.println(" 4 - Protection (Carapace)");

        // This is what will store the numbners of their choice
        int choice = input.nextInt();

        // This string variable to hold the hers name  
        String heroName;
        // This string variable is going to hold the special power
        String power; 

        // This will check if the user picks power 1 
        if(choice == 1){
            // Sets the heros name
            heroName = "LadyBug";
            // Sets their power 
            power = "Lucky Charm";
        }
        // Checks if the user picked option 2 
        else if (choice == 2){
        // sets the heros name
        heroName = "Cat Noir";
        // Sets the power 
        power = "Cataclysm";
        }
        // checks if user picked option 3 
       else if (choice == 3){
        // sets the heros name
        heroName = "Rena Rouge";
        // Sets the power 
        power = "Mirage";
        }
        // lastly, checks if they picked option 4 
        else{
        // sets the heros name
        heroName = "Carapace";
        // Sets the power 
        power = "Protection";
        } 

        // This calculates a power level using how many times they faught an Akuma and how old they are
        // I chose to use 5 so that its like 5 hours to fight an akuma and that counts against your power level and your age makes it look like more 
        double powerLevel = (amount * 5) + age;

        //To make it look cleaner i ned a blank line to print beforte the results 
        System.out.println();
        // I want to greet the user before revealing thewir new identity
        System.out.println("Welcome to the team, " + name + "!");
        // this what will tell the user which hero they are based on what they picked from the options I gave
        System.out.println("Your hero name is " + heroName + " and the power you have is " + power + "!");
        // Tells the user their power level 
        System.out.println("Your Power Level is: " + powerLevel);
        

        // This is my programs closing line
        System.out.println("Now go save Paris!");

        // This will close my Scanner since there is no more input 
        input.close();

    }
}
