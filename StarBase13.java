// 10.3.26
// Nevaeh Fernandez
// mevferna@uat.edu
// Assignemnt 2.1 

import java.util.Scanner;

public class StarBase13 {
    // My program starts running here 
    public static void main(String[] args) {
        // this is what allows the program to read what the user types
        Scanner input = new Scanner(System.in);

        System.out.println("I am Hal, What is your name?");
        // This reads the users name and stores it in String Variable
        String name = input.nextLine();

        // I want to add my banner to look neater 
        System.out.println("===========================");
        // My welcome message here to make sure it desplays the name of the user and rhe message I want to go along with it 
        System.out.println("Hi " + name + ", Welcome to Starbase 13.");
        System.out.println("===========================");

        // My 5 sentence description is going to be displayed in my output There is no input needed so I only have print statements 
        System.out.println("As your shuttle drifts closer, Starbase 13 glows like a giant silver wheel against the blackness of space.");
        System.out.println("Its massive outter ring turns slowly, with thousandds of tiny windows reflecting a warm yellow light.");
        System.out.println("Bright blue guide beacons flash along the docking bay, helping to safly lead your shuttle inside.");
        System.out.println("Enormous solar panels stretch out from both sides of the station and sparkle in the light of the distant sun.");
        System.out.println("On the hull, the Acme Intergalactic Space Agency logo shines in huge, bold red letters as you are preparing to dock.");

        // This then closes my scanner and cuts off input 
        input.close();


    }
}