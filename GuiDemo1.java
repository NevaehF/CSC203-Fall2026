// 10.06.26
// GUI's 
// Week 5 

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicInteger;

public class GuiDemo1 {
    public static void main(String[] args){
        // Store how much water the plant has
        AtomicInteger water = new AtomicInteger(60);
        // Store how happy the plant is
        AtomicInteger happiness = new AtomicInteger(70);
        // Store the Plants health
        AtomicInteger health = new AtomicInteger(50);

        // Create the main window for my application 
        JFrame window = new JFrame();
        // Give the window a title 
        window.setTitle("My VIrtual Plant");
        // Set the size of window
        window.setSize(600, 500);
        // Make the program stop when window is closed
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Use Grid layout to organize the components 
        // I was having issues with FlowLayout printing an error I couldn't figure out so VS rereccomended
        // I hate the layout but it was th eonly way to make it work for the time being
        window.setLayout(new GridLayout(5,1));

        // Create a title label 
        JLabel title = new JLabel("My VIrtual Plant");
        // Create a label for the plants name 
        JLabel plantName = new JLabel("Plant: Sunny");
        // Display the current water level
        JLabel waterLabel = new JLabel("Water Level: " + water);
        // Display the current happiness level
        JLabel happinessLabel = new JLabel("Happiness: " + happiness);
        // Display the current health level
        JLabel healthLabel = new JLabel("Health: " + health);

        // add a status label
        JLabel messageLabel = new JLabel("Sunny is waitingfor you");

        // Create 3 Buttons 
        // 1- a button for watering the plant 
        JButton waterButton = new JButton("Water");
        // 2- a button to give the plant sunlight 
        JButton sunlightButton = new JButton("Sunlight");
        // 3 - a button to give the plant fertilizer
        JButton fertilizerButton = new JButton("Fertilizer");

        // add action  listener to the water button 
        waterButton.addActionListener(e -> {
            water.set(water.get() + 10);
            // Update the water label on the screen
            waterLabel.setText("Water: " + water);
            // Display a message in the console 
            System.out.println("Sunny was watered!");
            messageLabel.setText("Sunny feels refreshed");
        });

        // Add action listeneer to the water button 
        sunlightButton.addActionListener(e ->{
            happiness.set(happiness.get() + 10);
            happinessLabel.setText("Happiness: " + happiness);
            messageLabel.setText("Sunny is enjoying the sunshine!");
            System.out.println("Sunny recieved sunshine!");
        });

        // Add an action listener tot he fertilizer button
        fertilizerButton.addActionListener(e -> {
            health.set(health.get() + 10);
            healthLabel.setText("Health: " + health);
            messageLabel.setText("Sunny is growing stronger!");
            System.out.println("Sunny was fertilized");
        });


        // Add labels to window
        window.add(title);
        window.add(plantName);
        window.add(waterLabel);
        window.add(happinessLabel);
        window.add(healthLabel);

        // add buttons to the window
        window.add(waterButton);
        window.add(sunlightButton);
        window.add(fertilizerButton);

        // add label to window
        window.add(messageLabel);

        // Make the window visable 
        window.setVisible(true);
    }
}
