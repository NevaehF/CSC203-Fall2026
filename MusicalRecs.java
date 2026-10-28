// Nevaeh Fernandez
// 10.23.26
// nevferna@uat.edu
// Final Project Module 7 

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

// This is my Musical class. Every musical object stores information about one of the musical recommendation.
class Musical {
    // These are the properties for each musical. This will be what helps me organize them.
    // This is how my notes app looks when i send recommendations to my friends so i did my best to make it look similar 
    public String title;
    public String genre;
    public String mood;
    public String description;
    public String imageFile;

    // Constructor used when creating a new musical object.
    public Musical(String title, String genre, String mood, String description, String imageFile){
        this.title = title;
        this.genre = genre;
        this.mood = mood;
        this.description = description;
        this.imageFile = imageFile;
    }
}

public class MusicalRecs{
    // This creates an empty list named musicals that will hold Musical objects and makes it available to the whole class.
    static ArrayList<Musical> musicals = new ArrayList<Musical>();

    // This method loads all of my musical objects.
    public static void loadMusicals(){

        // I couldn't figure out an efective way to make my text wrap so my descriptions are going to be short and brif. 
        // This creates a new musical and it's information and adds it to the list
        // I couldn't help myself and ended up adding my top favorites 
        musicals.add(new Musical(
                 "Hamilton",
                "Historical",
                "Inspirational",
        "Americas founding told through rap and hip-hop.",
                "images/hamilton.jpg"));

        musicals.add(new Musical(
                "Wicked",
                "Fantasy",
                "Emotional",
         "The witches of Oz before The Wizard of Oz.",
                "images/wicked.jpg"));

        musicals.add(new Musical(
                "Six",
                "Historical",
                "Funny",
                "Henry VIIIs wives tell their stories as pop stars.",
                "images/six.jpg"));

        musicals.add(new Musical(
                "Beetlejuice",
                "Fantasy",
                "Funny",
        "A chaotic ghost helps a lonely teenager.",
                "images/BJ.jpg"));

        musicals.add(new Musical(
                "EPIC: Musical Album ",
                "Greek Mythology",
                "Funny",
                "Odysseus's journey home retold through modern music.",
                "images/EPIC.jpg"));

        musicals.add(new Musical(
                "HadesTown",
                "Greek Mythology",
                "Emotional",
                "A tragic love story set in the underworld.",
                "images/HadesTown.jpg"));

        musicals.add(new Musical(
                "Heathers",
                "Drama",
                "Dark",
                "A dark comedy about high school popularity and murder.",
                "images/heathers.jpg"));

        musicals.add(new Musical(
                "Dear Evan Hansen",
                "Drama",
                "Emotional",
                "A teen’s lie leads to unexpected connections.",
                "images/DEH.jpg"));

        musicals.add(new Musical(
                "Newsies",
                "Historical",
                "Inspirational",
                "Newsboys fight back against unfair treatment.",
                "images/newsies.jpg"));

        musicals.add(new Musical(
                "Phantom of the Opera",
                "Drama",
                "Dark",
                "A masked genius becomes obsessed with a singer.",
                "images/Phantom.jpg"));
    }

    // This method searches through my ArrayList and returns a matching musical to what the user picked.
    public static Musical findMusical(String genre, String mood){

        // This loops through every musical
        for(int i = 0; i < musicals.size(); i++){

            // Store the current musical.
            Musical currentMusical =
                    musicals.get(i);

            // This is what checks if both the genre and mood match one of the musicals on the list.
            if(currentMusical.genre.equals(genre)&& currentMusical.mood.equals(mood)){
                // This is what will give out the musical recomndation based on the chosen oprions
                return currentMusical;
            }
        }

        // This will eturn null if no match is found. 
        return null;
    }

    // My code starts running here
    public static void main(String[] args){

        // This loads all of my musicals before the GUI opens
        loadMusicals();

        // This is the main window for my application.
        JFrame window = new JFrame();
        // This gives me window a title 
        window.setTitle("Give Me A Musical!");
        // This sets the size of the window. I was going to go bigger but hated how it looked so I will stick with the smaller style
        window.setSize(500,600);
        // This closes the program when the user exits.
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Use BorderLayout to organize the GUI.
        window.setLayout(new BorderLayout());

        // I need to create a panel to organize all of my labels
        // dropdown menus are what I decided I wanted to use to mak my aplication neater
        JPanel centerPanel = new JPanel(new GridLayout(11,1));

        // This is the main title of my program.
        JLabel title = new JLabel("Give Me a Musical!",
                        SwingConstants.CENTER);

        // This label explains to the user the purpose of my program
        // I wanted the user to immediately understand what
        // the program does before using it.
        JLabel description = new JLabel("Let's find the musical that best fits your taste!",
                        SwingConstants.CENTER);


        // These instructions explain how to use the app.
        JLabel instructions = new JLabel("Choose a genre and mood then click Find My Musical.",
                        SwingConstants.CENTER);

        
        
        /* We didnt learn how to make a dropdown menue so I learned to make them and a JComboBox is a dropdown list that allows
        the user to select one option from choices that I already provided. I chose to use a JComboBox because it prevents 
        spelling mistakes and makes my application easier to use and the code easier to read [in my opinion]. */

        
        /* This is my Genre dropdown menu.

        JComboBox is what declairs a dropdown menue that stores the string tect values.
        genreBox is the name of the dropdown menue variable, then it assigns a value ot the variable and 
        creates a new object and then the ending JComboBox is what creates an empty dropdown menu that will hold the options made ( in this line the genres) */
        JComboBox<String> genreBox = new JComboBox<String>();

        // These are the genres of the musicals I chose and they are being added to the dropdown menue
        genreBox.addItem("Fantasy");
        genreBox.addItem("Historical");
        genreBox.addItem("Drama");
        genreBox.addItem("Greek Mythology");

        // This JComboBox is what stores my mood choices. Same breakdown as above (in this line its the mood)
        // Whatever the user selects can be read later using getSelectedItem().
        JComboBox<String> moodBox = new JComboBox<String>();

        // These are the mood choices of each musical and they are being added to the second dropdown menue
        moodBox.addItem("Funny");
        moodBox.addItem("Emotional");
        moodBox.addItem("Inspirational");
        moodBox.addItem("Dark");

        // This is where I create my recommendation button.
        JButton recommendButton = new JButton("Find My Musical");

        // These labels will be what display the recommendation and all of the information I stored about it
        JLabel resultTitle = new JLabel("Title:");
        JLabel resultGenre = new JLabel("Genre:");
        JLabel resultDescription = new JLabel("Your recommendation will appear here.");

        // This label will display the poster image of the msuical thats recommended to the user
        JLabel posterLabel = new JLabel();

        // This action listener runs whenever the user clicks the button.
        recommendButton.addActionListener(e -> {

            // This reads the genre selected by the user.
            String selectedGenre = (String) genreBox.getSelectedItem();

            // This reads the mood selected by the user.
            String selectedMood = (String) moodBox.getSelectedItem();

            // This uses the above input to search for a matching musical.
            Musical recommendation = findMusical(selectedGenre, selectedMood);

            // Since I didnt choose a musical for every genre and every mood this will check if a recommendation was found.
            if(recommendation != null){
                resultTitle.setText(
                        "Title: " + recommendation.title);
                resultGenre.setText("Genre: " + recommendation.genre);
                resultDescription.setText(recommendation.description);
                // This loads the image that belongs to the musical recommended
                ImageIcon poster = new ImageIcon(recommendation.imageFile);
                posterLabel.setIcon(poster);

            }else{
                // If no musical matches the genre and mood combo the user selected then it will return a no mach found message and the user can look for something else
                resultTitle.setText("No Match Found");
                resultGenre.setText("");
                resultDescription.setText("Try selecting different options.");
                posterLabel.setIcon(null);
            }

            // This will print a message in the console.
            System.out.println("Recommendation button clicked.");
        });

        // This is what adds all of my components to the panel.
        centerPanel.add(title);
        centerPanel.add(description);
        centerPanel.add(instructions);
        centerPanel.add(genreBox);
        centerPanel.add(moodBox);
        centerPanel.add(recommendButton);
        centerPanel.add(resultTitle);
        centerPanel.add(resultGenre);
        centerPanel.add(resultDescription);

        // This adds the panel to the center of the window.
        window.add(centerPanel,BorderLayout.CENTER);

        // This adds the poster image to the bottom of the window.
        window.add(posterLabel, BorderLayout.SOUTH);

        // Display the GUI.
        window.setVisible(true);
    }
}