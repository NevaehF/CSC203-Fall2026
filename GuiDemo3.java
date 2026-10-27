// 10.13.26
// GUIs Week 6

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.io.File;



public class GuiDemo3 {
    // STep 6: 
    static int secondsRemaining = 30;
    // Display the countdwon
    static JLabel timerLabel;
    static JLabel messageLabel;
    static JFrame frame;
    // Keep a refrence to the running timer
    static Timer countdownTimer;

    public static void main(String[] args){
        // Step 1: 
        JFrame window = new JFrame("Study Break Assistant"); // Create the main application 
        window.setSize(450,500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Position the window in the center of the screen
        window.setLocationRelativeTo(null);

        // Step 2: 
        window.setLayout(new BorderLayout());
        JLabel title = new JLabel("Welcome to your study break assistant!",
            SwingConstants.CENTER);

        // Make the title larger and bold
        title.setFont(new Font("Arial", Font.BOLD, 22));
       // JLabel instructions = new JLabel(
          //  "Take a moment to relax and recharge.",
           // SwingConstants.NORTH);
        
    // Step 3: 
        // Load the image from the project folder 
        ImageIcon studyImage = new ImageIcon("image/study.png");
        // Put the image in a label 
        JLabel studyImageLabel = new JLabel(studyImage,
            SwingConstants.CENTER);
    // Step 4: 
        JButton startButton = new JButton("Start Break!");
        JButton resetButton = new JButton("Reset!");
        JButton motivateButton = new JButton("Motivate Me!");
        // Create a panel to group the buttons 
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(motivateButton);
        timerLabel = new JLabel(
            "30 seconds", SwingConstants.CENTER);
        
            // Make the countdown larger and easy to read 
            timerLabel.setFont(new Font("Arial", Font.BOLD, 28));

    // Step 5: 
        // Create a label for message to the user
        JLabel messageLabel = new JLabel(
            "Click a button to get started",
            SwingConstants.CENTER);
        
        startButton.addActionListener(e -> {
           // Avoid starting multiple countdowns at once
           if(countdownTimer != null && countdownTimer.isRunning()){
            return;
           }
           //Start From 30 Seconds
           secondsRemaining -= 1;
           // Create a timer that runs every 1000 Milliseconds
           countdownTimer = new Timer(1000, event ->{
            // Decrease the remaining time by one second 
            secondsRemaining --;
            // Update the countdown Label 
            timerLabel.setText(secondsRemaining + "seconds");
            // Check whether the countdown has finished
            if(secondsRemaining <= 0){
                countdownTimer.stop(); // stop the timer
                timerLabel.setText("Break COmplete!");
                messageLabel.setText("Time to get back to studying!");
                // Play the sound when the break ends
                playSound("sounds/chime.wav");
            }
           });

            countdownTimer.start();
            messageLabel.setText("Relax and enjoy your break!");
        });

        resetButton.addActionListener(e -> {
            // Stop the timer of exists
            if(countdownTimer != null){
                countdownTimer.stop();
            }
            // restore the original time 
            secondsRemaining = 30;
            messageLabel.setText("CLick a button to start your break!");
            
        });

        motivateButton.addActionListener(e -> {
            // Store possible message in array 
            String[] messages = {
                "Small steps lead to big results",
                "You're making progress!",
                "Take a break and keep going",
                "You've got that!",
                "Consistancy beats perfection!"
            };
            // choose a random index from the array
            int randomIndex = (int) (Math.random() * messages.length);
            //Display the selected message
            messageLabel.setText(messages[randomIndex]);
            // Play short sound for feedback
            playSound("sound/chime.wav");
        });

    // Step 7: 
        // Give the window a light background color 
        window.getContentPane().setBackground(new Color(235,245,240));
        // Create the top panel for the title and image
        JPanel topPanel = new JPanel(new GridLayout(2,1,5,5));
        topPanel.setBackground(new Color(235,245,240));

        // Add the title and image to the top panel 
        topPanel.add(title);
        topPanel.add(studyImageLabel);

        // Create the center panel for the countdown and message 
       JPanel centerPanel= new JPanel(new GridLayout(2,1,5,5));
        // add the countdown message 
        centerPanel.add(timerLabel);
        centerPanel.add(messageLabel);
        buttonPanel.setBackground(new Color(235,245,240));
        // Add the panels to the main window
        window.add(topPanel, BorderLayout.NORTH);
        window.add(centerPanel, BorderLayout.CENTER);
        window.add(buttonPanel, BorderLayout.SOUTH);

        window.setVisible(true);
    }

// Step 8: 
    // Play a short WAV sound
static void playSound(String filePath){
        // a way to deal with run time errors
        try{
            //open the sound file
            File soundFile = new File(filePath);
            //read the audio file
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            // create an audio clip 
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            // play the sound
            clip.start();
        } catch(Exception exception){
            // Report a problem if the sound cannot be played 
            System.out.println("Error: Unable to Play sound: " + exception.getMessage());
        }
    }
 }


