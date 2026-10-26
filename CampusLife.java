// 10.06.26
// Nevaeh Fernandez 
// nevferna@uat.edu
//Assignemnt 4.1

// This is my Parent Class (Super Class)
class Person {
    // These are the public properties that can be accessed anywhere. I want both of my child classes to be able to use them without needing getters and setters.
    public String firstName;
    public String lastName;
    public String title;

    // This private property can only be accessed inside this class
    private String location;

    // This method allows the person to talk
    public void talk() {
        System.out.println(firstName + " is talking.");
    }

    // This is the method that allows the person to eat
    public void eat() {
        System.out.println(firstName + " is eating lunch.");
    }

    // Method that allows a person to sleep
    public void sleep() {
        System.out.println(firstName + " is sleeping.");
    }

    // Getter method used to access the private location variable
    public String getLocation() {
        return location;
    }

    // This setter method is used to change the private location variable
    public void setLocation(String location) {
        this.location = location;
    }
}

// Professor is the child class that inherits from Person It inherits all of the properties
// and methods from the parent Person class
class Professor extends Person {

    //  this is my Professor specific method
    public void teach() {
        System.out.println(firstName + " is teaching a Statistics Class.");
    }
}

// Child class that inherits from Person
class Student extends Person {

    // This is the Student specific method
    public void study() {
        System.out.println(firstName + " is studying possibilities.");
    }
}

// Main class that runs the program
public class CampusLife {

    public static void main(String[] args) {

        // My Welcome message
        System.out.println("===================");
        System.out.println("Welcome to UAT!");
        System.out.println("===================");

        // This is my Professor object
        Professor professor1 = new Professor();
        professor1.firstName = "Heather"; // My actual Stats teacher 
        professor1.lastName = "Peters";
        professor1.title = "Professor";

        // This sets the professors location using the setter method
        professor1.setLocation("Room 201");

        // This is what will show my proffessor information 
        System.out.println("\n8:00 AM - Meet Your Professor");
        System.out.println("Name: " + professor1.firstName + " " + professor1.lastName);
        System.out.println("Title: " + professor1.title);
        System.out.println("Location: " + professor1.getLocation());

        // Calls my methods that were inherited from Person
        professor1.talk();

        // Calls my method from Professor class
        professor1.teach();

        // My Student object
        Student student1 = new Student();
        // This assigns values to the student's properties
        student1.firstName = "Nevaeh";
        student1.lastName = "Fernandez";
        student1.title = "Student";

        // This is what sets the location using the setter method
        student1.setLocation("Library");

        // This prints my student information
        System.out.println("\n10:00 AM - Student Activities");
        System.out.println("Name: " + student1.firstName + " " + student1.lastName);
        System.out.println("Title: " + student1.title);
        System.out.println("Location: " + student1.getLocation());

        // this calls the inherited methods
        student1.talk();
        student1.study();

        // This prints my Lunch time block
        System.out.println("\n12:00 PM - Lunch Time");
        professor1.eat();
        student1.eat();

        // My afternoon Homework Session Block
        System.out.println("\n3:00 PM - Afternoon Homework Session");
        student1.study();

        // My End of the day block 
        System.out.println("\n10:00 PM - End of the Day");
        student1.sleep();

        // I like how it looks split from the schedule block 
System.out.println("=========================================================");

        // My Goodbye message
        System.out.println("\nThank you for spending the day on campus!");
    }
}