// 09/29/2026

// Ingeritance
//Super class - Parent

/* Example 1 

class Animal{
    String name; // Attribute or data members 
    public void eat(){ // Method 
        System.out.println(name + " is easting!");
    }
}

// Delivered class - Child
class Dog extends Animal{
    public void bark(){
        System.out.println(name + " is barking!");
    }
}

public class SuperClassDemo {
    public static void main(String[] args){
        Dog dog1 = new Dog();
        dog1.name = "Mallow";
        dog1.eat(); // coming from parent class (Animal)
        dog1.bark(); // coming from child class (Dog)
    }
    
}

*/

/* Example 2 

class Person{
    String name; 
    int age;
    public void introduce(){
        System.out.println("My name is " +name);
    }
}

// Derived Class - Child
class Student extends Person{
    String major; 
    public void study(){
        System.out.println(name + " is studying");
    }
}

public class SuperClassDemo {
    public static void main(String[] args){
        Student student1 = new Student();
        student1.name = "Nevaeh";
        student1.age = 19;
        student1.major = "Computer Science";
        student1.introduce();
        student1.study();
    }
}
*/

/* Example 3 */

class Person{
    String name; 
    public Person(String name){     // Constructor 
        this.name=name;
    }
}

class Student extends Person{
    int studentID;
    Student(String name, int studentID){
        super(name);
        this.studentID=studentID;
    }
}

    public class SuperClassDemo{
        public static void main(String[] args){
            Student student1 = new Student("Sally", 12345);
            Student student2 = new Student("Michael", 54651);
            System.out.println(student1.name);
            System.out.println(student1.studentID);
            System.out.println(student2.name);
            System.out.println(student2.studentID);

        }
    }

