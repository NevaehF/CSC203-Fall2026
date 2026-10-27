// 10.13.26
// Nevaeh Fernandez 
// Assignment 5.1 
// nevferna@uat.edu

import javax.swing.*;
import java.awt.*;

public class VirtualPetGui{

    // These are my pets starting stats. Hunger goes down when I feed the puppy, happiness goes up when I play with the puppy, and the appearance goes up when I groom the ppuppy.
    static int hunger = 60;
    static int happiness = 70;
    static int appearance = 50;

    // My program starts running here.
    public static void main(String[] args) {

        // I have to create the main window for my application
        JFrame window = new JFrame();

        // Giving my window a title
        window.setTitle("My Virtual Pet");

        // this is what i set the size of my window to 
        window.setSize(500, 600);

        // This is what will stop the program when the user closes the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Use BorderLayout to organize the different sections
        // of my GUI into the top, center, and bottom.
        window.setLayout(new BorderLayout(10, 10));

        // Create a title to display at the top of the GUI
        JLabel title = new JLabel("My Virtual Pet!", SwingConstants.CENTER);

        // I have to create a panel to organize my pet information. GridLayout places the labels underneath each other.
        JPanel centerPanel = new JPanel(new GridLayout(6, 1, 5, 5));

        // this loads the image of my virtual pet from the images folder
        ImageIcon petImage = new ImageIcon("images/puppy.jpg");

        // I put the image inside a JLabel so it can be displayed in the center of my program.
        JLabel petImageLabel = new JLabel(petImage, SwingConstants.CENTER);

        // e a label for my pet's name
        JLabel petName = new JLabel("Meet Marshmallow Your Vertual Puppy");

        // These labels display the pets current stats
        JLabel hungerLabel = new JLabel("Hunger: " + hunger);
        JLabel happinessLabel = new JLabel("Happiness: " + happiness);
        JLabel cleanlinessLabel = new JLabel("Cleanliness: " + appearance);

        // This label displays messages to the user whenever they interact with the pet.
        JLabel messageLabel = new JLabel("Marshmallow is ready to play!");

        // This is what adds everything to the center panel
        centerPanel.add(petImageLabel);
        centerPanel.add(petName);
        centerPanel.add(hungerLabel);
        centerPanel.add(happinessLabel);
        centerPanel.add(cleanlinessLabel);
        centerPanel.add(messageLabel);

        // These are the three required buttons
        JButton feedButton = new JButton("Feed");
        JButton playButton = new JButton("Play");
        JButton groomButton = new JButton("Groom");

        // This is what creates the panel to hold my buttons
        JPanel buttonPanel = new JPanel();

        // This button decreases the pets hunger level.
        feedButton.addActionListener(e -> {
            hunger = hunger - 10;
            // This is how I prevent the hunger from going below zero.
            if (hunger < 0) {
                hunger = 0;
            }

            // This is the update the label so the new hunger value appears.
            hungerLabel.setText("Hunger: " + hunger);
            messageLabel.setText("Marshmallow loved the snack!");
            System.out.println("Marshmallow has been fed!");
        });

        // This button increases the pets happiness.
        playButton.addActionListener(e -> {
            happiness = happiness + 10;

            // This is how I happiness from going over 100.
            if (happiness > 100) {
                happiness = 100;
            }

            // Update the label on the screen.
            happinessLabel.setText("Happiness: " + happiness);

            // Update the message shown to the user.
            messageLabel.setText("Marshmallow is having lots of fun!");

            // Display a message in the console.
            System.out.println("Marshmallow is playing!");
        });

        // Groom Button
        // This button increases the pets cleanliness.
        groomButton.addActionListener(e -> {

            // This is what will Increase appearance when the marshmallow is groomed.
            appearance = appearance + 10;
            // this is how I prevent appearance from exceeding 100.
            if (appearance > 100) {
                appearance = 100;
            }

            // This updates the label with the new appearance value.
            cleanlinessLabel.setText("Appearance: " + appearance);
            messageLabel.setText("Marshmallow is clean and fluffy!");
            System.out.println("Marshmallow has been groomed!");
        });

        // This adds my buttons to the button panel
        buttonPanel.add(feedButton);
        buttonPanel.add(playButton);
        buttonPanel.add(groomButton);

        // this adds everything to the main window
        window.add(title, BorderLayout.NORTH);
        window.add(centerPanel, BorderLayout.CENTER);
        window.add(buttonPanel, BorderLayout.SOUTH);

        // This is what displays my GUI to the User
        window.setVisible(true);
    }
}

