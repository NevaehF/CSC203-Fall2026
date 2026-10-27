// 10.08.26
// Week 5 #2 

import javax.swing.*; 
import java.awt.*;


public class GuiDemo2 {
    // Step 3 - Display the Fish's attributes
    static int hunger = 60; 
    static int happiness = 70; 
    static int waterQuality = 50; 

    public static void main(String[] args) {
        //  Step 1 
        JFrame window = new JFrame();   // Create a new window
        window.setTitle("My Virtual Aquarium"); // Give the window a title 
        window.setSize(500, 600);   // DImensions
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit when window close 
        window.setLayout(new BorderLayout(10,10)); // Arrange the main sections

        // Step 2: add the title and fish name 
        JLabel title = new JLabel("My VIrtual Aquariym!");
        // Create a panel to organize the fish and it's information
        JPanel centerPanel = new JPanel(new GridLayout(5,1,5,5));
        JLabel fishName = new JLabel("Meet Bubbles the Goldfish");

        // Step 3: Create Labels
        JLabel hungerLabel = new JLabel("Hunger: " + hunger);
        JLabel happinessLabel = new JLabel("Happiness: " + happiness);
        JLabel waterQualityLabel = new JLabel("Water Quality: " + waterQuality);

        // Create a friendlt message to the user 
        JLabel message = new JLabel("Bubbles is ready for an adventure!!"); 
        
        // Step 4:  create three buttons
        JButton feedButton = new JButton("Fish");
        JButton playButton = new JButton("Play");
        JButton cleanButton = new JButton("Clean");
        JPanel buttonPanel = new JPanel();
        // Suggestion by Visual studo code since it wasn't woring 
        buttonPanel.setLayout(new java.awt.FlowLayout());

        // Step 5 : MAke buttons work 
        feedButton.addActionListener(e -> {
            hunger = hunger - 10;
            if(hunger < 0) {
                hunger = 0;
            }
            hungerLabel.setText("Hunger: " + hunger);
            System.out.println("Bubbles has been fed!");
        });

        playButton.addActionListener(e -> {
            happiness = happiness + 10; 
            if(happiness > 10) {
                happiness = 100;
            }
            happinessLabel.setText("Happiness: " + happiness);
            System.out.println("Bubbles is having fun!");
        });

        cleanButton.addActionListener(e -> {
            waterQuality = waterQuality + 10; 
            if(waterQuality > 10){
                waterQuality = 100;
            }
            waterQualityLabel.setText("Water Quality: " + waterQuality);
            System.out.println("The aquarium has been cleaned!");
        });

        window.add(title);
        window.add(fishName);
        window.add(hungerLabel);
        window.add(happinessLabel);
        window.add(waterQualityLabel);
        window.add(feedButton);
        window.add(playButton);
        window.add(cleanButton);
        centerPanel.add(fishName);
        centerPanel.add(hungerLabel);
        centerPanel.add(happinessLabel);
        centerPanel.add(waterQualityLabel);
        centerPanel.add(message);
        window.add(centerPanel, BorderLayout.CENTER);
        buttonPanel.add(feedButton);
        buttonPanel.add(playButton);
        buttonPanel.add(cleanButton);

        // Place the buttons at the bottom of the window 
        window.add(buttonPanel, BorderLayout.SOUTH);
        window.setVisible(true); // Display the window 
    }
    
}
