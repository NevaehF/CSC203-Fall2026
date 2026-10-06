// 10.05.26
// Nevaeh Fernandez Assignemnt 3.1
// nevferna@uat.edu

// needs a scanner in order to be able to get user input 
import java.util.Scanner;

public class JujutsuMethodsSim {
    

    // This is my first method: This will show my stories introduction and it will not have any perameters or any return values. Just print statements 
    public static void introduction(){
        // My title to introduce my program to my user with the banner of course 
        System.out.println("============================================");
        System.out.println("Jujutsu High: Mission to The Cursed School");
        System.out.println("============================================\n");

        // This is basically the plot of the first episode youre just in the main characters shoes and it's a planned mission instead of a freak accident 
        System.out.println("You are a first-year sorcerer at Jujutsu High, tagging along with Gojo on your first misson.");
        System.out.println("A powerful curse is hiding in an abonded school's hallways and seems to only be active at midnight.");
        System.out.println("Your mission is to use your cursed energy to find and eliminate the curse before it can become more powerful.");
    }

    // This is my second method. This method will be takignt the string parameter (aka the players name) and print Gojos greeting line. 
    // for now nothing is being retuned since its dialogue mainly 
    public static void getGreetings(String name){
        // extra space to seperate from the first question asked (neater look) 
        System.out.println();

        System.out.println("Gojo: Alright then " + name + "! The curse is somewhere inside. Don't die!!\n");
    }

    // This is my third method and it will be asking the user to pick their technique and it will return the one chosen as an Integer
    // The Scanner is passed as a main parameter so that it can be used in the main method and not have to be closed in this method.
    public static int chooseTechnique(Scanner input){
        // These are the opriond for the user to choose from 
        System.out.println("Choose your technique: ");
        System.out.println("1. Cursed Energy Manipulation");
        System.out.println("2. Cursed Tool Wielding");
        System.out.println("3. Domain Expansion");
        System.out.println("Enter the number of your choice: ");

        // This is what reads the number the user input and is what is stored 
        int choice = input.nextInt();
        // This will send the choice back to main 
        return choice;
    }
    
    // This is my fourth method, it is in charge of taking the technique chosen (the int perameter) and will return how much damage it can do
    // damageCalc stands for damage Calculation
    public static int damageCalc(int technique){
        // depending on the technique determines a different amount of damage. 
        // I chose these numbers specifically so that it's possible for the curse to be killed in 2 hits since i am only adding in 2 attacks 
        if(technique == 1){
            return 10;
        }else if(technique == 2){
            return 20;
        }else if(technique == 3){
            return 15;
        }else{
            // if the user doesnt choose a number 1 -3 then there will be a return of zero damage (just as there would be in the show)
            System.out.println("You didn't choose a valid technique. You missed your chance to attack!");
            return 0;
        }
    }

    // This is my fifth method another int perameter. It will take the curses health and print it for the user 
    public static void showHealth(int curseHealth){
        System.out.println("The curse has " + curseHealth + " remaining health.\n"); 
    }

// This is my sixth method, it will take the damage done and print it for the user 
    public static void showDamage(int damage){
        System.out.println("You did " + damage + " damage to the curse!\n");
    }

    // This is my sixth method, this will now take the users name and the curses remaining health and print the ending to my simulation 
    public static void endMessage(String name, int curseHealth){
        // If the curse dies /0 health then the user will win the sim 1st ending
        if(curseHealth <=0){
            // another banner since there was so much info and this si the end and should be neatly seperated 
            System.out.println("===========================================================");
            System.out.println("The curse fades away and there is no longer a threat!!!");
            System.out.println("Gojo: Not Bad, " + name + "! I guess youll be a decent sorcerer.");
            System.out.println("MISSION COMPLETE!");
            System.out.println("===========================================================");
        }else {
            // if the user doesnt exorcise the curse then they get the alternate/ second ending 
            System.out.println("========================================================");
            System.out.println("The curse is still alive and it overpowers you, trying to consume your cursed energy!");
            System.out.println("Gojo steps in and exorcises the curse and saves you.");
            // thought it would be sadder if Gojo was dissapointed in the user 
            System.out.println("Gojo: GO back to the books " + name + " you weren't ready");
            System.out.println("MISSION FAILED!");
            System.out.println("=======================================================");
        }
        }
    
 // My code officially starts to run here. The main controls all of my methods 
        public static void main(String[] args){
            // As always this allows the input to be read by my program 
            Scanner input = new Scanner(System.in);

            // Method 1: My introduction 
            introduction(); 

            // adding an extra space to sepertae this from the intro paragraph 
            System.err.println()
            ;
            // The users name is asked and is stored in the string variable 
            System.out.println("Gojo: Whats your name rookie?");
            String name = input.nextLine();

            //Method 2: This is greeting the user by name 
           getGreetings(name);

            // The curse will start with 30 health since for one its not that strong and there needs to be enough for a couple of hits its the forst mission ever 
            int curseHealth = 30; 
            showHealth(curseHealth);

            // First attack is displayed 
            System.out.println("-------First Attack-------");

            // Mehtod 3 is what takes the users choice then method 4 turns it to damage against the curse
            int choice1 = chooseTechnique(input);
            int damage1 = damageCalc(choice1);
            curseHealth = curseHealth - damage1; 
            System.out.println("You delt " + damage1 + " damage!");

            // Method 5 shows the updated health after the attack 
            showHealth(curseHealth);

            //Second attack is displayed 
             System.out.println("-------Second Attack-------");

            int choice2 = chooseTechnique(input);
            int damage2 = damageCalc(choice2);

            // subtracting the hit / technique damage from the overall health or remaining health of the curse 
            curseHealth = curseHealth - damage2; 
            System.out.println("You delt " + damage2 + " damage!");

            showHealth(curseHealth);

            // Method 6: This is showing the ending message I typed above as well as the curses health 
            endMessage(name, curseHealth);

            // scanner is now closed and no more input is taken 
            input.close();
        }
    }
      



